package com.tranquyet.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tranquyet.utils.DateFormatConverter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public abstract class BasedInfor {
	@JsonProperty("dt")
	private String dateTime;
	@JsonProperty("pressure")
	private Double pressure;
	@JsonProperty("humidity")
	private Double humidity;
	@JsonProperty("wind_speed")
	private Double windSpeed;
	@JsonProperty("uvi")
	private Double uv;
	@JsonProperty("clouds")
	private Double clouds;
	@JsonProperty("weather")
	private StatusWeather[] status;

	public void setDateTime(String tm) throws Exception {
		dateTime = (DateFormatConverter.convertUTCtoISO(Long.valueOf(tm)));
	}

}

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
class StatusWeather {
	private String main;
	private String description;
}
