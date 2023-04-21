package com.portfolio.sping.hipernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.sping.hipernate.entitites.Order;
import com.portfolio.sping.hipernate.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();

	}

	public Order findByID(Long id) {

		Optional<Order> obj = repository.findById(id);
		return obj.get();

	}
}