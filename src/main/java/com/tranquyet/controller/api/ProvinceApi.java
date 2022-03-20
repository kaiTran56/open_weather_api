package com.tranquyet.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tranquyet.dto.ProvinceDTO;
import com.tranquyet.service.ProvinceService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin("*")
@RestController(value = "ProvinceApi")
@RequestMapping("/api/province")
@Slf4j
public class ProvinceApi {
	@Autowired
	private ProvinceService provinceService;

	@GetMapping
	public ResponseEntity<List<ProvinceDTO>> getProinces() {
		try {

			Optional<List<ProvinceDTO>> provinces = Optional.of(provinceService.getAllProvince());
			return new ResponseEntity<>(provinces.get(),
					provinces.isPresent() ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
