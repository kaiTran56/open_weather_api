package com.tranquyet.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.tranquyet.entity.ProvinceEntity;

@Repository
@Transactional
public interface ProvincesRepository
		extends JpaRepository<ProvinceEntity, Long>, JpaSpecificationExecutor<ProvinceEntity> {

}
