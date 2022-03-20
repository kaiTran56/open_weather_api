package com.tranquyet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "provinces")
public class ProvinceEntity extends BasedEntity {
	@Column(name = "lat")
	private Double lat;
	@Column(name = "lon")
	private Double lon;
	@Column(name = "name")
	private String name;
}
