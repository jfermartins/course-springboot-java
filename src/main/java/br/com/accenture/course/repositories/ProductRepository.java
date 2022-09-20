package br.com.accenture.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.accenture.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
