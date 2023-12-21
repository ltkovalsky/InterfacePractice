package com.example.interfacepractice.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResourceTwoDto {
    private String id;
    private String someTextField;
    private String someDateField;
    private String someDateTimeField;
}
