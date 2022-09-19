package br.com.accenture.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.accenture.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
