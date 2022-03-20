package com.tranquyet.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranquyet.convert.ProvinceConverter;
import com.tranquyet.dto.ProvinceDTO;
import com.tranquyet.repository.ProvincesRepository;
import com.tranquyet.service.ProvinceService;

@Service
public class ProvinceServiceImpl implements ProvinceService {
	@Autowired
	private ProvincesRepository provincesRepository;

	@Autowired
	private ProvinceConverter provinceConverter;

	@Override
	public List<ProvinceDTO> getAllProvince() {
		return provincesRepository.findAll().stream().map(p -> provinceConverter.toDTO(p)).collect(Collectors.toList());
	}

}
