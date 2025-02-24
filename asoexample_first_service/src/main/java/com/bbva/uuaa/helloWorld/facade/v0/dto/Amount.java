package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter

public class Amount {

    @NotNull(message = "La cantidad máxima permitida no puede ser nula.")
    private Integer amount;

    @NotEmpty(message = "La moneda no puede ser nula ni vacía.")
    private String currency;

}
