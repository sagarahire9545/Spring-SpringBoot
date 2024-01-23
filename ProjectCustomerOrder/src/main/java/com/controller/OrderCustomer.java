package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Order;
import com.service.OrderService;

@RestController
public class OrderCustomer {

	@Autowired
	OrderService orderService;

	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order o) {
		return orderService.saveOrder(o);
	}
	
	
}
