package com.tranquyet.convert;

import org.springframework.stereotype.Component;

import com.tranquyet.dto.ProvinceDTO;
import com.tranquyet.entity.ProvinceEntity;

@Component
public class ProvinceConverter implements BasedConvert<ProvinceDTO, ProvinceEntity> {

	@Override
	public ProvinceDTO toDTO(ProvinceEntity h) {
		ProvinceDTO dto = new ProvinceDTO();
		dto.setId(h.getId());
		dto.setLat(h.getLat());
		dto.setLon(h.getLon());
		dto.setName(h.getName());
		return dto;
	}

	@Override
	public ProvinceEntity toEntity(ProvinceDTO h) {
		ProvinceEntity entity = new ProvinceEntity();
		entity.setId(h.getId());
		entity.setLat(h.getLat());
		entity.setLon(h.getLon());
		entity.setName(h.getName());
		return entity;
	}

}
