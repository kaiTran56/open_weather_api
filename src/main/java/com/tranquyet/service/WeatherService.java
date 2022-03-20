package com.tranquyet.service;

import java.util.List;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.tranquyet.constants.ActionType;
import com.tranquyet.domain.CurrentWeatherInfor;
import com.tranquyet.domain.ForecastWeatherInfor;

public interface WeatherService {

	default Object getBody(String url, ActionType action) throws JSONException {
		if (url == null || action == null) {
			return null;
		}
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		JSONObject jsonObj = new JSONObject(response.getBody());
		switch (action) {
		case CURRENT -> {
			JSONObject mainObj = jsonObj.getJSONObject(action.getKey());
			return mainObj.toString();
		}
		case DAILY -> {
			JSONArray mainObjs = jsonObj.getJSONArray(action.getKey());
			return mainObjs;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + action);
		}
	}

	CurrentWeatherInfor getCurrentInfor(String url) throws JsonMappingException, JsonProcessingException, JSONException;

	List<ForecastWeatherInfor> getForecastInfor(String url)
			throws JsonMappingException, JsonProcessingException, JSONException;
}
