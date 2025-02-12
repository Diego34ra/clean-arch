package com.udemy.cleanArch.core.useCase;

import com.udemy.cleanArch.core.domain.Customer;

public interface UpdateCustomerUserCase {

    void update(Customer customer, String zipCode);

}
