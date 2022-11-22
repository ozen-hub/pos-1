package com.bootcamp.pos.repo;

import com.bootcamp.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;


@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer,String> {
}
