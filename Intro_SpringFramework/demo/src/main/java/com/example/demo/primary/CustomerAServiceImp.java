package com.example.demo.primary;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
 Otra opcion @Qualifier pero @Autowired es la mas recomendable
 */

@Service
public class CustomerAServiceImp implements  CustomerService{
    @Override
    public String hello() {
        return "Hello from customer A";
    }
}
