package com.example.interfacepractice.business.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


/**
 * Business representation of Resource2
 */
@Data
@Builder
public class ResourceTwo {

    private UUID uuid;
    private LocalDate someDateField;
    private LocalDateTime someDateTimeField;
}
