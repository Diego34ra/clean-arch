package com.udemy.cleanArch.dataProvider;

import com.udemy.cleanArch.core.dataProvider.DeleteCustomerById;
import com.udemy.cleanArch.dataProvider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}

