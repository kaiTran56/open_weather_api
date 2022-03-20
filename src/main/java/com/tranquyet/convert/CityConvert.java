package com.tranquyet.convert;

import org.springframework.stereotype.Component;

import com.tranquyet.dto.CapitalCityDTO;
import com.tranquyet.entity.CapitalCityEntity;

@Component
public class CityConvert implements BasedConvert<CapitalCityDTO, CapitalCityEntity> {

	@Override
	public CapitalCityDTO toDTO(CapitalCityEntity h) {
		CapitalCityDTO dto = new CapitalCityDTO();
		dto.setId(h.getId());
		dto.setLat(h.getLat());
		dto.setLon(h.getLon());
		dto.setName(h.getName());
		return dto;
	}

	@Override
	public CapitalCityEntity toEntity(CapitalCityDTO h) {
		CapitalCityEntity entity = new CapitalCityEntity();
		entity.setId(h.getId());
		entity.setLat(h.getLat());
		entity.setLon(h.getLon());
		entity.setName(h.getName());
		return entity;
	}

}
