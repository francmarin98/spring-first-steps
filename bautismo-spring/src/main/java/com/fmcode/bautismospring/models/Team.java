package com.fmcode.bautismospring.models;

import lombok.Data;
import lombok.NonNull;
import org.springframework.format.annotation.NumberFormat;

@Data
public class Team {
    @NonNull
    private String country;

    @NonNull
    private String confederation;

}
