package com.udemy.cleanArch.dataProvider;

import com.udemy.cleanArch.core.dataProvider.InsertCustomer;
import com.udemy.cleanArch.core.domain.Customer;
import com.udemy.cleanArch.dataProvider.repository.mapper.CustomerEntityMapper;
import com.udemy.cleanArch.dataProvider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
