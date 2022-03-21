package com.tranquyet.constants;

public enum ActionType {
	CURRENT("current"), DAILY("daily"), TIMEZONE("timezone_offset");

	private String key;

	ActionType(String key) {
		this.key = key;

	}

	public String getKey() {
		return key;
	}
}
