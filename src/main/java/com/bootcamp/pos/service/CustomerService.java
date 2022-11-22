package com.bootcamp.pos.service;

import com.bootcamp.pos.entity.Customer;
import com.bootcamp.pos.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public String save(Customer c){
        customerRepo.save(c);
        return "Saved "+c.getId();
    }
    public Customer get(String id){
       /* Optional<Customer> record = customerRepo.findById(id);
        if (record.isPresent()){
            return record.get();
        }
        return null;*/
        return customerRepo.findById(id).orElse(null);
    }

}
