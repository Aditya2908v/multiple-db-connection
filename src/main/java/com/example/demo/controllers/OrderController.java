package com.example.demo.controllers;


import com.example.demo.dto.CustomerOrder;
import com.example.demo.models.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/save")
    public String save(@RequestBody Order order) {
        Order order1  = orderService.save(order);
        return "Order id: " + order1.getOrderId();
    }


}
