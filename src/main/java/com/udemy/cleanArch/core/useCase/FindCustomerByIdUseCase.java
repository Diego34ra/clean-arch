package com.udemy.cleanArch.core.useCase;

import com.udemy.cleanArch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
    Customer find(final String id);
}
