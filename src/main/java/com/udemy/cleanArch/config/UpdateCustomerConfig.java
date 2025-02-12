package com.udemy.cleanArch.config;

import com.udemy.cleanArch.core.useCase.impl.FindCustomerByIdUseCaseImpl;
import com.udemy.cleanArch.core.useCase.impl.UpdateCustomerUserCaseImpl;
import com.udemy.cleanArch.dataProvider.FindAddressByZipCodeImpl;
import com.udemy.cleanArch.dataProvider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUserCaseImpl updateCustomerUserCase(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, FindAddressByZipCodeImpl findAddressByZipCode, UpdateCustomerImpl updateCustomer){
        return new UpdateCustomerUserCaseImpl(findCustomerByIdUseCase,findAddressByZipCode,updateCustomer);
    }
}
