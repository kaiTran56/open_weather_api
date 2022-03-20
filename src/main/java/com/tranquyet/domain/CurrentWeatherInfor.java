package com.tranquyet.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeatherInfor extends BasedInfor {
	@JsonProperty("temp")
	private Double temp;
	@JsonProperty("visibility")
	private Double visibility;

}
