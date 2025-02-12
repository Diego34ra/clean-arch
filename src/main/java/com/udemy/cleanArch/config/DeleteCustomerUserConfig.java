package com.udemy.cleanArch.config;

import com.udemy.cleanArch.core.useCase.impl.DeleteCustomerUserCaseImpl;
import com.udemy.cleanArch.core.useCase.impl.FindCustomerByIdUseCaseImpl;
import com.udemy.cleanArch.dataProvider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerUserConfig {

    @Bean
    public DeleteCustomerUserCaseImpl deleteCustomerUserCase(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, DeleteCustomerByIdImpl deleteCustomerById){
        return new DeleteCustomerUserCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
