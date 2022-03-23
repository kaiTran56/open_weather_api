package com.tranquyet.service;

import java.util.List;

import org.springframework.boot.configurationprocessor.json.JSONException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.tranquyet.domain.CurrentWeatherInfor;
import com.tranquyet.domain.ForecastWeatherInfor;
import com.tranquyet.dto.SearchCondition;

public interface WeatherService {

	CurrentWeatherInfor getCurrentInfor(String url, SearchCondition condition)
			throws JsonMappingException, JsonProcessingException, JSONException;

	List<ForecastWeatherInfor> getForecastInfor(String url, SearchCondition conditio)
			throws JsonMappingException, JsonProcessingException, JSONException;
}
