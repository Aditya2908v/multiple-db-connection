package com.example.demo.service;

import com.example.demo.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {

    @Autowired
    @Qualifier("customerDbMongoTemplate")
    private MongoTemplate customerDbMongoTemplate;

    public Customer save(Customer customer){
        return customerDbMongoTemplate.save(customer);
    }

    public List<Customer> findAll(){
        return customerDbMongoTemplate.findAll(Customer.class);
    }

    public Customer findByCustomerId(String customerId) {
        return customerDbMongoTemplate.findById(customerId,Customer.class);
    }
}