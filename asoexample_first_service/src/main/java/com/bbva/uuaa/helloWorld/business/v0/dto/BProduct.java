package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
public class BProduct {

    private String id;

    @Valid
    private BSubProduct subproduct;
}
