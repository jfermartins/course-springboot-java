package br.com.accenture.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.accenture.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
