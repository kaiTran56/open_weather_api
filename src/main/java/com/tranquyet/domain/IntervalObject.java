package com.tranquyet.domain;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntervalObject {
	private JSONObject obj;
	private JSONArray arr;
	private Long timezone;
}
