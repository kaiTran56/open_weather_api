package com.team.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.convert.ProvinceConverter;
import com.team.dto.ProvinceDTO;
import com.team.repository.ProvincesRepository;
import com.team.service.ProvinceService;

@Service("ProvinceServiceImpl")
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
