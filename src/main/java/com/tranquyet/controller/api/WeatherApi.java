package com.tranquyet.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tranquyet.constants.UrlWeatherApi;
import com.tranquyet.domain.CurrentWeatherInfor;
import com.tranquyet.domain.ForecastWeatherInfor;
import com.tranquyet.service.WeatherService;

@RestController(value = "WeatherApi")
@RequestMapping("/api")
public class WeatherApi {
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/current")
	public ResponseEntity<CurrentWeatherInfor> getCurrentWeather() {
		String url = UrlWeatherApi.GET_ONECALL_CURRENT_WEATHER;
		try {
			Optional<CurrentWeatherInfor> currInfo = Optional.of(weatherService.getCurrentInfor(url));
			return new ResponseEntity<>(currInfo.get(),
					currInfo.isPresent() ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}

	}

	@GetMapping("/forecast")
	public ResponseEntity<List<ForecastWeatherInfor>> getOnecallWeather() throws Exception {
		String url = UrlWeatherApi.GET_ONECALL_FORECAST_WEATHER;
		try {

			Optional<List<ForecastWeatherInfor>> dailyInfo = Optional.of(weatherService.getForecastInfor(url));
			return new ResponseEntity<>(dailyInfo.get(),
					dailyInfo.isPresent() ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
