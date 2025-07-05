package com.example.demo.config;

import com.example.demo.primary.CustomerAServiceImp;
import com.example.demo.primary.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    /*
    Esta opcion se usa para configurar clases que provienen de framework externos
     */

    @Bean
    public CustomerService customerService(){
        return new CustomerAServiceImp();

    }
}
