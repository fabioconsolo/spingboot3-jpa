package com.portfolio.sping.hipernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.sping.hipernate.entitites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
