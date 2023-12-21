package com.example.interfacepractice.business.mapper;

import com.example.interfacepractice.business.model.ResourceTwo;
import com.example.interfacepractice.rest.dto.ResourceTwoDto;


/**
 * Should match {@link MapperContract}
 */
public class ResourceTwoMapper {
    public static ResourceTwoDto toDto(ResourceTwo obj) {
        return ResourceTwoDto.builder()
                // some mapping
                .build();
    }
}
