package com.example.demo;

import com.example.demo.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Aplicacion {

    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);

        ApplicationContext context = SpringApplication.run(Aplicacion.class, args);

        var employeeController = context.getBean(EmployeeController.class);

        System.out.println(employeeController.helloFromEmployeeService());
        System.out.println(employeeController.helloFromCustomerService());
    }



}
