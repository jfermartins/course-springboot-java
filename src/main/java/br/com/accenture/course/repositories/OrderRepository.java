package br.com.accenture.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.accenture.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
