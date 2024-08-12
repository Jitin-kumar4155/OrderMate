package com.ordermate.orders.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping ( "/v1/orders" )
public class OrdersController
{
    @GetMapping
    public void getAllOrders(){
        log.info ("Received request for getting all orders");

    }
}
