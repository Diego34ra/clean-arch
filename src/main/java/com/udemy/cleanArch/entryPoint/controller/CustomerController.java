package com.udemy.cleanArch.entryPoint.controller;

import com.udemy.cleanArch.core.dataProvider.DeleteCustomerById;
import com.udemy.cleanArch.core.dataProvider.FindCustomerById;
import com.udemy.cleanArch.core.domain.Customer;
import com.udemy.cleanArch.core.useCase.DeleteCustomerUserCase;
import com.udemy.cleanArch.core.useCase.FindCustomerByIdUseCase;
import com.udemy.cleanArch.core.useCase.InsertCustomerUseCase;
import com.udemy.cleanArch.core.useCase.UpdateCustomerUserCase;
import com.udemy.cleanArch.entryPoint.controller.mapper.CustomerMapper;
import com.udemy.cleanArch.entryPoint.controller.request.CustomerRequest;
import com.udemy.cleanArch.entryPoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUserCase updateCustomerUserCase;

    @Autowired
    private DeleteCustomerUserCase customerUserCase;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer,customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerResponse> find(@PathVariable final String id){
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @RequestBody @Valid CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUserCase.update(customer,customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id){
        customerUserCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
