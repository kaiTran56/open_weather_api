package com.tranquyet.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ForecastWeatherInfor extends BasedInfor {
	@JsonProperty("temp")
	private Temperature temp;
}

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
class Temperature {
	private Double day;
	private Double min;
	private Double max;
	private Double night;
	private Double eve;
	private Double morn;
}
