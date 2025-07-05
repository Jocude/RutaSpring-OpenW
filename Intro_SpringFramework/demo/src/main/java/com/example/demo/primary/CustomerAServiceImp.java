package com.example.demo.primary;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


//@Service
public class CustomerAServiceImp implements  CustomerService{
    @Override
    public String hello() {
        return "Hello from customer A";
    }
}
