package com.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("product1")
    public Product productDetails(){
        return new Product("Shampoo",101,299.00);
    }
    @Bean("product2")
    public Product productDetails1(){
        return new Product("Conditioner",201,499.0);
    }
}
