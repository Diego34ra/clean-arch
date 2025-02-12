package com.udemy.cleanArch.core.useCase;

import com.udemy.cleanArch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
