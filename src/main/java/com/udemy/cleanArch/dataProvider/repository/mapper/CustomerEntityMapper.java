package com.udemy.cleanArch.dataProvider.repository.mapper;

import com.udemy.cleanArch.core.domain.Customer;
import com.udemy.cleanArch.dataProvider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer (CustomerEntity customerEntity);
}
