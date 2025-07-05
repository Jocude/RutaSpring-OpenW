package com.example.demo.controller;
import com.example.demo.primary.CustomerService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImp;
import com.example2.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService ;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private HelloService helloService;

//    public EmployeeController(EmployeeService employeeService, CustomerService customerService, HelloService helloService) {
//        this.employeeService = employeeService;
//        this.customerService = customerService;
//        this.helloService = helloService;
//    }

    public String helloFromEmployeeService(){
        return this.employeeService.hello();
    }

    public String helloFromCustomerService(){
        return this.customerService.hello();
    }


}
