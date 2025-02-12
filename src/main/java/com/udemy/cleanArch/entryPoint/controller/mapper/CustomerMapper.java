package com.udemy.cleanArch.entryPoint.controller.mapper;

import com.udemy.cleanArch.core.domain.Customer;
import com.udemy.cleanArch.entryPoint.controller.request.CustomerRequest;
import com.udemy.cleanArch.entryPoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
