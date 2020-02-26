package com.br.api.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.api.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}