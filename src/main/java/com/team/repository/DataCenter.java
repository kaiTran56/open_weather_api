package com.team.repository;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team.constants.ActionType;
import com.team.domain.IntervalObject;

public class DataCenter {

	public static IntervalObject getBody(String url, ActionType action)
			throws JSONException, JsonMappingException, JsonProcessingException {
		if (url == null || action == null) {
			return null;
		}
		IntervalObject obj = new IntervalObject();
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		JSONObject jsonObj = new JSONObject(response.getBody());
		JsonNode newNode = mapper.readTree(response.getBody());
		Long timezone = newNode.get(ActionType.TIMEZONE.getKey()).asLong();
		switch (action) {
		case CURRENT:
			JSONObject mainObj = jsonObj.getJSONObject(action.getKey());
			obj.setObj(mainObj);
			obj.setTimezone(timezone);
			return obj;

		case DAILY:
			JSONArray mainObjs = jsonObj.getJSONArray(action.getKey());
			obj.setArr(mainObjs);
			obj.setTimezone(timezone);
			return obj;

		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}
	}

}
