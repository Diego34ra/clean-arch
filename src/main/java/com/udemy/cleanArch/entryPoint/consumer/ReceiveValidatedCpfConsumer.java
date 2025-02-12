package com.udemy.cleanArch.entryPoint.consumer;

import com.udemy.cleanArch.core.useCase.UpdateCustomerUserCase;
import com.udemy.cleanArch.entryPoint.consumer.mapper.CustomerMessageMapper;
import com.udemy.cleanArch.entryPoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerUserCase updateCustomerUserCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "ribeiro")
    public  void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUserCase.update(customer,customerMessage.getZipCode());
    }
}
