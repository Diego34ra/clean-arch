package com.udemy.cleanArch.config;

import com.udemy.cleanArch.core.useCase.impl.FindCustomerByIdUseCaseImpl;
import com.udemy.cleanArch.dataProvider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerByIdImpl findCustomerById){
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
