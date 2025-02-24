package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper
public interface ISrvHelloWorldMapper {

    @Mappings({
            @Mapping(target = "details.offerType", source = "details.offerType"),
            @Mapping(target = "details.limitAmount.amount", source = "details.limitAmount.amount"),
            @Mapping(target = "details.limitAmount.currency", source = "details.limitAmount.currency"),
            @Mapping(target = "details.product.id", source = "details.product.id"),
           @Mapping(target = "details.product.subproduct.id", source = "details.product.subproduct.id")
    })
    //Mapeo de entrada
    BDtoIn mapIn(DtoIn dtoIn);

         @Mappings({
         @Mapping(target = "id", source = "id"),
                @Mapping(target = "nuip", source = "nuip"),
                @Mapping(target = "details.offerType", source = "details.offerType"),
                @Mapping(target = "details.limitAmount.amount", source = "details.limitAmount.amount"),
                @Mapping(target = "details.limitAmount.currency", source = "details.limitAmount.currency"),
                @Mapping(target = "details.product.id", source = "details.product.id"),
                @Mapping(target = "details.product.subproduct.id", source = "details.product.subproduct.id")

    })
         //Mapeo de salida
    DtoOut mapOut(BDtoOut bdtoOut);

}
