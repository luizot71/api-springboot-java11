package com.br.api.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.api.spring.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
