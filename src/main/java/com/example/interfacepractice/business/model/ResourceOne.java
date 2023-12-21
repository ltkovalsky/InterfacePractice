package com.example.interfacepractice.business.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Business representation of Resource1
 */

@Data
@Builder
public class ResourceOne {

    private UUID uuid;
    private String someTextField;
    private LocalDate someDateField;
}
