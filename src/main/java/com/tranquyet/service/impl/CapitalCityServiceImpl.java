package com.tranquyet.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranquyet.convert.CityConvert;
import com.tranquyet.dto.CapitalCityDTO;
import com.tranquyet.repository.CapitalCityRepository;
import com.tranquyet.service.CapitalCityService;

@Service("CapitalCityServiceImpl")
public class CapitalCityServiceImpl implements CapitalCityService {
	@Autowired
	private CapitalCityRepository repo;

	@Autowired
	private CityConvert cityConvert;

	@Override
	public List<CapitalCityDTO> getAllProvince() {
		return repo.findAll().stream().map(p -> cityConvert.toDTO(p)).collect(Collectors.toList());
	}

}
