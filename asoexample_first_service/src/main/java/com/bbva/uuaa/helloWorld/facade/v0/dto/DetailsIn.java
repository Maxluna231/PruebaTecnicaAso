package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class DetailsIn {

    @NotNull(message = "El tipo de oferta no puede ser nulo.")
    @Pattern(regexp = "^[A-Z_]+$", message = "El tipo de oferta debe estar en mayúsculas.")
    private String offerType;

    @Valid
    private Amount limitAmount;

    @Valid
    private Product product;

}
