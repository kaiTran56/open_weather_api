package com.tranquyet.constants;

import lombok.Getter;

@Getter
public enum OpenWeatherType {
	ONECALL("ONECALL", "onecall?");

	private String key;
	private String value;

	OpenWeatherType(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
