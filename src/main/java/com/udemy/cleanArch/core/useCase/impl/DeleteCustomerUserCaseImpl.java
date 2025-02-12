package com.udemy.cleanArch.core.useCase.impl;

import com.udemy.cleanArch.core.dataProvider.DeleteCustomerById;
import com.udemy.cleanArch.core.useCase.DeleteCustomerUserCase;
import com.udemy.cleanArch.core.useCase.FindCustomerByIdUseCase;

public class DeleteCustomerUserCaseImpl implements DeleteCustomerUserCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerUserCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerById deleteCustomerById) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomerById.delete(id);
    }
}
