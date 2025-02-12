package com.udemy.cleanArch.entryPoint.consumer.mapper;

import com.udemy.cleanArch.core.domain.Customer;
import com.udemy.cleanArch.entryPoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
