package com.example.demo.service;

import com.example.demo.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    @Qualifier("orderDbMongoTemplate")
    private MongoTemplate orderDbMongoTemplate;

    public Order save(Order order){
        return orderDbMongoTemplate.save(order);
    }

    // Other methods
}