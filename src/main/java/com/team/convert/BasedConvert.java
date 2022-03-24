package com.team.convert;

public interface BasedConvert<T, H> {

	T toDTO(H h);

	H toEntity(T t);

}
