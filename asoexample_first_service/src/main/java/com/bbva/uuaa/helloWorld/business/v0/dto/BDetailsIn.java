package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BDetailsIn {

    private String offerType;

    private BAmount limitAmount;

    private BProduct product;

}
