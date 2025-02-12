package com.udemy.cleanArch.core.useCase.impl;

import com.udemy.cleanArch.core.dataProvider.FindCustomerById;
import com.udemy.cleanArch.core.domain.Customer;
import com.udemy.cleanArch.core.useCase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private  final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
