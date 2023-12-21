package com.example.interfacepractice.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResourceOneDto {
    private String id;
    private String someTextField;
    private String someDateField;
}
