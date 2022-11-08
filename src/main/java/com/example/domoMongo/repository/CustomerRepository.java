package com.example.domoMongo.repository;

import com.example.domoMongo.domain.Customer;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository {
    @Query("{'address.city':{$in:[?0]}}")
    List<Customer> findAllCustomerFromCity(String city);
}
