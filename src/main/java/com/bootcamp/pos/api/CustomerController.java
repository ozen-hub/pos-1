package com.bootcamp.pos.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@Controller //==> jsp =>*/
@RestController // client =>
@RequestMapping(value = "/api/v1/customer")
public class CustomerController {
    // http://localhost:5000/api/v1/customer/create
    @PostMapping("/create")
    public String saveCustomer(){
        return "Created";
    }
}
