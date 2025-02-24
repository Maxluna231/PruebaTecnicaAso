package com.bbva.uuaa.helloWorld.facade.v0.dto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import java.io.Serializable;

@Getter
@Setter

public class DtoIn implements Serializable {

	private String nuip;

	@Valid  // Indica que se deben validar las restricciones dentro de la clase DetailsIn
	private DetailsIn details;
}
