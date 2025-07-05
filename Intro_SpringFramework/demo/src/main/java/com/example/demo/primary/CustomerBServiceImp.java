package com.example.demo.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
public class CustomerBServiceImp implements CustomerService{
    @Override
    public String hello() {
        return "Hello from customer B";
    }
}
