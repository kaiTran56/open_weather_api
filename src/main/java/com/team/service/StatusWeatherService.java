package com.team.service;

import java.util.List;

import org.springframework.boot.configurationprocessor.json.JSONException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.team.domain.CurrentWeatherInfor;
import com.team.domain.ForecastWeatherInfor;
import com.team.dto.SearchCondition;

public interface StatusWeatherService {

	CurrentWeatherInfor getCurrentInfor(String url, SearchCondition condition)
			throws JsonMappingException, JsonProcessingException, JSONException;

	List<ForecastWeatherInfor> getForecastInfor(String url, SearchCondition conditio)
			throws JsonMappingException, JsonProcessingException, JSONException;
}
