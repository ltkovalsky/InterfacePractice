package com.example.interfacepractice.business.mapper;

import com.example.interfacepractice.persistence.entity.EntityMarker;

public interface MapperContract<DTO, BUSINESS, ENTITY extends EntityMarker> {

    DTO toDto(BUSINESS obj);

    BUSINESS toBusiness(DTO obj);

    BUSINESS toBusiness(ENTITY obj);

    ENTITY toEntity(BUSINESS obj);

}
