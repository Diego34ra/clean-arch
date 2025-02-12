package com.udemy.cleanArch.dataProvider;

import com.udemy.cleanArch.core.dataProvider.UpdateCustomer;
import com.udemy.cleanArch.core.domain.Customer;
import com.udemy.cleanArch.dataProvider.repository.CustomerRepository;
import com.udemy.cleanArch.dataProvider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
