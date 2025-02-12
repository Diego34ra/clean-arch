package com.udemy.cleanArch.dataProvider;

import com.udemy.cleanArch.core.dataProvider.FindCustomerById;
import com.udemy.cleanArch.core.domain.Customer;
import com.udemy.cleanArch.dataProvider.repository.CustomerRepository;
import com.udemy.cleanArch.dataProvider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
