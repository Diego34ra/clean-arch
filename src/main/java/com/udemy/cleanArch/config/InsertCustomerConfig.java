package com.udemy.cleanArch.config;

import com.udemy.cleanArch.core.useCase.impl.InsertCustomerUseCaseImpl;
import com.udemy.cleanArch.dataProvider.FindAddressByZipCodeImpl;
import com.udemy.cleanArch.dataProvider.InsertCustomerImpl;
import com.udemy.cleanArch.dataProvider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode, InsertCustomerImpl insertCustomer, SendCpfForValidationImpl sendCpfForValidation){
        return new InsertCustomerUseCaseImpl(findAddressByZipCode,insertCustomer,sendCpfForValidation);
    }
}
