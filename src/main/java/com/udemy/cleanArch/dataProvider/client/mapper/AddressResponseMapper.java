package com.udemy.cleanArch.dataProvider.client.mapper;

import com.udemy.cleanArch.core.domain.Address;
import com.udemy.cleanArch.dataProvider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
