package com.tranquyet.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tranquyet.dto.CapitalCityDTO;
import com.tranquyet.service.CapitalCityService;

import lombok.extern.slf4j.Slf4j;

@RestController(value = "CaptialCityApi")
@RequestMapping("/api/cities")
@Slf4j
public class CaptialCityApi {
	@Autowired
	private CapitalCityService capitalCityService;

	@GetMapping
	public ResponseEntity<List<CapitalCityDTO>> getCapitalCities() {
		try {

			Optional<List<CapitalCityDTO>> provinces = Optional.of(capitalCityService.getAllProvince());
			return new ResponseEntity<>(provinces.get(),
					provinces.isPresent() ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
