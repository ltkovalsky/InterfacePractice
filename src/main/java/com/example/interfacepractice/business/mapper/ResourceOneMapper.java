package com.example.interfacepractice.business.mapper;

import com.example.interfacepractice.business.model.ResourceOne;
import com.example.interfacepractice.persistence.entity.ResourceOneEntity;
import com.example.interfacepractice.rest.dto.ResourceOneDto;

/**
 * Should match {@link MapperContract}
 */
public class ResourceOneMapper {

    public static ResourceOneDto toDto(ResourceOne obj) {
        return ResourceOneDto.builder()
                // some mapping
                .build();
    }

    public static ResourceOne toBusiness(ResourceOneDto obj) {
        return ResourceOne.builder()
                // some mapping
                .build();
    }

    public static ResourceOne toBusiness(ResourceOneEntity obj) {
        return ResourceOne.builder()
                // some mapping
                .build();
    }

    public static ResourceOneEntity toEntity(ResourceOne obj) {
        ResourceOneEntity result = new ResourceOneEntity();
        // some mapping
        return result;
    }

}
