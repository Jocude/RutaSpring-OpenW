package com.example.demo;

import com.example.demo.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication

@ComponentScan({"com.example","com.example2"}) //SI LO PODEMOS EVITAR USAR MEJOR, METER TODO EN UN PAQUETE

public class Aplicacion {

    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);

        ApplicationContext context = SpringApplication.run(Aplicacion.class, args);

        var employeeController = context.getBean(EmployeeController.class);

        System.out.println(employeeController.helloFromEmployeeService());

        System.out.println(employeeController.helloFromCustomerService());
    }



}
