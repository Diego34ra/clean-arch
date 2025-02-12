package com.udemy.cleanArch.core.dataProvider;

import com.udemy.cleanArch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(String id);
}
