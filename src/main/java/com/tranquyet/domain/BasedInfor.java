package com.tranquyet.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tranquyet.constants.WeatherConstant;

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
	@JsonProperty("timezone_offset")
	private Long timezone;
	@JsonProperty("image")
	private String image;
	@JsonProperty("icon")
	private String icon;

	public void setStatus(StatusWeather[] status) {
		this.status = status;
		String descr = status[0].getDescription();
		if (descr.contains(WeatherConstant.RAIN.getKey())) {
			this.image = WeatherConstant.RAIN.getValue();
			this.icon = WeatherConstant.RAIN_ICON.getValue();
		}
		if (WeatherConstant.CLEAR_SKY.getKey().contains(descr)) {
			this.image = WeatherConstant.CLEAR_SKY.getValue();
			this.icon = WeatherConstant.CLEAR_SKY_ICON.getValue();
		}
		if (descr.contains(WeatherConstant.CLOUDS.getKey())) {
			this.image = WeatherConstant.CLOUDS.getValue();
			this.icon = WeatherConstant.CLOUDS_ICON.getValue();
		}
		if (WeatherConstant.MIST.getKey().contains(descr)) {
			this.image = WeatherConstant.MIST.getValue();
			this.icon = WeatherConstant.MIST_ICON.getValue();
		}
		if (WeatherConstant.SNOW.getKey().contains(descr)) {
			this.image = WeatherConstant.SNOW.getValue();
			this.icon = WeatherConstant.SNOW_ICON.getValue();
		}
		if (WeatherConstant.THUNDERSTORM.getKey().contains(descr)) {
			this.image = WeatherConstant.THUNDERSTORM.getValue();
			this.icon = WeatherConstant.THUNDERSTORM_ICON.getValue();
		}
	}
//
//	public void setDateTime(String tm) throws Exception {
//		dateTime = (DateFormatConverter.convertUTCtoISO(Long.valueOf(tm)));
//	}

}

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
class StatusWeather {
	private String main;
	private String description;
}
