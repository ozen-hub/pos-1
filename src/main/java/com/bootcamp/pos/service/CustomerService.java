package com.bootcamp.pos.service;

import com.bootcamp.pos.entity.Customer;
import com.bootcamp.pos.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public String save(Customer c) {
        customerRepo.save(c);
        return "Saved " + c.getId();
    }
    public Customer get(String id) {
       /* Optional<Customer> record = customerRepo.findById(id);
        if (record.isPresent()){
            return record.get();
        }
        return null;*/
        return customerRepo.findById(id).orElse(null);
    }
    public List<Customer> getAll() {
        return (List<Customer>) customerRepo.findAll();
    }
    public String update(Customer c) {
        Customer c1 = customerRepo.findById(c.getId()).orElse(null);
        if (c1 != null) {
            c1.setName(c.getName());
            c1.setSalary(c.getSalary());
            c1.setAddress(c.getAddress());
            return "Updated " + customerRepo.save(c1).getId();
        }
        return "404 Not Found";
    }
    public String delete(String id) {
        customerRepo.deleteById(id);
        return "Deleted " + id;
    }

}
