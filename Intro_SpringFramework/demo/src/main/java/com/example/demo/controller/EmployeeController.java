package com.example.demo.controller;
import com.example.demo.primary.CustomerService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService ;

    @Autowired
    private CustomerService customerService;

    public String helloFromEmployeeService(){
        return this.employeeService.hello();
    }

    public String helloFromCustomerService(){
        return this.customerService.hello();
    }


}
