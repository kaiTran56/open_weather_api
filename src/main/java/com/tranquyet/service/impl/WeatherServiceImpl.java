package com.tranquyet.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tranquyet.constants.ActionType;
import com.tranquyet.constants.KeyApi;
import com.tranquyet.domain.CurrentWeatherInfor;
import com.tranquyet.domain.ForecastWeatherInfor;
import com.tranquyet.domain.IntervalObject;
import com.tranquyet.dto.SearchCondition;
import com.tranquyet.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Override
	public CurrentWeatherInfor getCurrentInfor(String url, SearchCondition conditio)
			throws JsonMappingException, JsonProcessingException, JSONException {

		ObjectMapper mapper = new ObjectMapper();
		url = url.replace(KeyApi.REPLACE_COND, conditio.toString());
		IntervalObject obj = getBody(url, ActionType.CURRENT);
		CurrentWeatherInfor currWeather = mapper.readValue(obj.getObj().toString(), CurrentWeatherInfor.class);
		currWeather.setTimezone(obj.getTimezone());
		return currWeather;
	}

	@Override
	public List<ForecastWeatherInfor> getForecastInfor(String url, SearchCondition conditio)
			throws JsonMappingException, JsonProcessingException, JSONException {
		ObjectMapper mapper = new ObjectMapper();

		url = url.replace(KeyApi.REPLACE_COND, conditio.toString());
		IntervalObject objInte = getBody(url, ActionType.DAILY);
		JSONArray arr = objInte.getArr();
		List<ForecastWeatherInfor> tempArr = new ArrayList<>();
		for (int i = 0; i < arr.length(); i++) {
			JSONObject obj = arr.getJSONObject(i);
			ForecastWeatherInfor temp = mapper.readValue(obj.toString(), ForecastWeatherInfor.class);
			temp.setTimezone(objInte.getTimezone());
			tempArr.add(temp);
		}
		return tempArr;
	}

}
