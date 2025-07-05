package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Override
    public String hello() {
        return "Hola mundo";
    }
}
