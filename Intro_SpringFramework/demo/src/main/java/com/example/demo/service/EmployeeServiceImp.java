package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 Otra opcion @Qualifier pero @Autowired es la mas recomendable
 */

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Override
    public String hello() {
        return "Hola mundo";
    }
}
