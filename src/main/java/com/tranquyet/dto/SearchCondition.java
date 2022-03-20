package com.tranquyet.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchCondition {
	private Double lat;
	private Double lon;

	public String toString() {
		return "lat=" + lat + "&lon=" + lon;
	}
}
