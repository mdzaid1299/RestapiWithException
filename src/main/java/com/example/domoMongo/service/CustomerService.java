package com.example.domoMongo.service;

import com.example.domoMongo.domain.Customer;
import com.example.domoMongo.exception.CustomerNotFound;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);

    List<Customer> getAllCustomerData() throws CustomerNotFound;

    public boolean deleteCustomer(int cusId) throws CustomerNotFound;

    List<Customer> getAllCustomerByCity(String city) throws CustomerNotFound;
}
