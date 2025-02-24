package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.BAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BProduct;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BSrvHelloWorld implements IBSrvHelloWorld {
    @Override
    public BDtoOut mapBusiness(BDtoIn dtoIn) {
        //Instancia del BDtoOut dentro de la carpeta Businness
        BDtoOut bdtoOut = new BDtoOut();
        // Generar un ID aleatorio de 10 caracteres
        bdtoOut.setId(UUID.randomUUID().toString().replace("-", "").substring(0, 10));
        // Asignar el número de identificacion personal (nuip) desde dtoIn
        bdtoOut.setNuip(dtoIn.getNuip());
        // Obtener los detalles de entrada del objeto dtoIn
        BDetailsIn requestDetails = dtoIn.getDetails();
        BDetailsOut responseDetails = new BDetailsOut();

        responseDetails.setOfferType(requestDetails.getOfferType());

        // Obtener el monto limite de la solicitud
        BAmount limitAmount = requestDetails.getLimitAmount();
        responseDetails.setLimitAmount(limitAmount);

        //Calcular Montos minimo y maximo
        BAmount minimumAmount = new BAmount();
        minimumAmount.setCurrency(limitAmount.getCurrency());
        minimumAmount.setAmount((int) (limitAmount.getAmount() * 0.9));

        BAmount maximumAmount = new BAmount();
        maximumAmount.setCurrency(limitAmount.getCurrency());
        maximumAmount.setAmount((int) (limitAmount.getAmount() * 1.05));

        responseDetails.setMaximumAmount(maximumAmount);
        responseDetails.setMinimumAmount(minimumAmount);

        //Obtener el id del subproducto y asignarlo al objeto de respuesta
        BProduct product = requestDetails.getProduct();
        responseDetails.setProduct(product);

        bdtoOut.setDetails(responseDetails);

        return bdtoOut;
    }

}

