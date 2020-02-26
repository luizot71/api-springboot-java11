package com.br.api.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.api.spring.entities.OrderItem;
import com.br.api.spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}