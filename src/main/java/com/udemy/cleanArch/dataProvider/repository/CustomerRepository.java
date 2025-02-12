package com.udemy.cleanArch.dataProvider.repository;

import com.udemy.cleanArch.dataProvider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity,String> {
}
