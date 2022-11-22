package com.bootcamp.pos.repo;

import com.bootcamp.pos.entity.Customer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepo extends CrudRepository<Customer,String> {
}
