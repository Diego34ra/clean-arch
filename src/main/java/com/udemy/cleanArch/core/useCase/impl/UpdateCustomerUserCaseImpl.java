package com.udemy.cleanArch.core.useCase.impl;

import com.udemy.cleanArch.core.dataProvider.FindAddressByZipCode;
import com.udemy.cleanArch.core.dataProvider.UpdateCustomer;
import com.udemy.cleanArch.core.domain.Customer;
import com.udemy.cleanArch.core.useCase.FindCustomerByIdUseCase;
import com.udemy.cleanArch.core.useCase.UpdateCustomerUserCase;

public class UpdateCustomerUserCaseImpl implements UpdateCustomerUserCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCode findAddressByZipCode;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUserCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCode findAddressByZipCode, UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
