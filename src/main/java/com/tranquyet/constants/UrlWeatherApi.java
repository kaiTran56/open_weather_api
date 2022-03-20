package com.tranquyet.constants;

public class UrlWeatherApi {

	public static final String OPEN_WEATHER_URL = "https://api.openweathermap.org/data/2.5/";

	public static String GET_ONECALL_CURRENT_WEATHER = OPEN_WEATHER_URL + OpenWeatherType.ONECALL.getValue()
			+ KeyApi.REPLACE_COND + "&units=metric&exclude=minutely,hourly,daily" + KeyApi.TOKEN_API;
	public static String GET_ONECALL_FORECAST_WEATHER = OPEN_WEATHER_URL + OpenWeatherType.ONECALL.getValue()
			+ KeyApi.REPLACE_COND + "&units=metric&exclude=minutely,hourly,current" + KeyApi.TOKEN_API;
}
