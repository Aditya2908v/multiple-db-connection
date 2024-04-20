package com.example.demo.dto;

import com.example.demo.models.Customer;
import com.example.demo.models.Order;
import lombok.Data;


import java.util.List;

@Data
public class CustomerOrder {
    Customer customer;
    List<Order> order;
}

