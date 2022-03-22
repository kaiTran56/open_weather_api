package com.tranquyet.constants;

import lombok.Getter;

@Getter
public enum WeatherConstant {
	CLEAR_SKY("clear sky", "https://img.locationscout.net/images/2019-09/tree-in-the-sunset-germany_l.jpeg"),
	CLOUDS("clouds", "https://img.locationscout.net/images/2019-09/tree-in-the-sunset-germany_l.jpeg"),
	RAIN("rain", "https://img.locationscout.net/images/2019-09/tree-in-the-sunset-germany_l.jpeg"),
	THUNDERSTORM("thunderstorm", "https://img.locationscout.net/images/2019-09/tree-in-the-sunset-germany_l.jpeg"),
	SNOW("snow", "https://img.locationscout.net/images/2019-09/tree-in-the-sunset-germany_l.jpeg"),
	MIST("mist", "https://img.locationscout.net/images/2019-09/tree-in-the-sunset-germany_l.jpeg"),

	CLEAR_SKY_ICON("clear sky", "https://icons.iconarchive.com/icons/pixelkit/flat-jewels/512/Weather-icon.png"),
	CLOUDS_ICON("clouds",
			"https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-many-clouds-icon.png"),
	RAIN_ICON("rain",
			"https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-showers-scattered-icon.png"),
	THUNDERSTORM_ICON("thunderstorm",
			"https://icons.iconarchive.com/icons/custom-icon-design/weather/256/thunder-icon.png"),
	SNOW_ICON("snow", "https://icons.iconarchive.com/icons/custom-icon-design/weather/256/snow-icon.png"),
	MIST_ICON("mist", "https://icons.iconarchive.com/icons/custom-icon-design/weather/256/fog-icon.png");

	private String key;
	private String value;

	WeatherConstant(String key, String value) {
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
