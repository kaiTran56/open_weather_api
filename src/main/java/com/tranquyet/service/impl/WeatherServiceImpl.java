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
import com.tranquyet.domain.CurrentWeatherInfor;
import com.tranquyet.domain.ForecastWeatherInfor;
import com.tranquyet.service.WeatherService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {

	@Override
	public CurrentWeatherInfor getCurrentInfor(String url)
			throws JsonMappingException, JsonProcessingException, JSONException {
		ObjectMapper mapper = new ObjectMapper();
		CurrentWeatherInfor currWeather = mapper.readValue(getBody(url, ActionType.CURRENT).toString(),
				CurrentWeatherInfor.class);
		return currWeather;
	}

	@Override
	public List<ForecastWeatherInfor> getForecastInfor(String url)
			throws JsonMappingException, JsonProcessingException, JSONException {
		ObjectMapper mapper = new ObjectMapper();
		JSONArray arr = (JSONArray) getBody(url, ActionType.DAILY);
		List<ForecastWeatherInfor> tempArr = new ArrayList<>();
		for (int i = 0; i < arr.length(); i++) {
			JSONObject obj = arr.getJSONObject(i);
			ForecastWeatherInfor temp = mapper.readValue(obj.toString(), ForecastWeatherInfor.class);
			tempArr.add(temp);
		}
		return tempArr;
	}

}
