package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc //<mvc:annotation-driven />
@Configuration
@ComponentScan({"com.example.service", "com.example.web"})
public class SpringConfiguration {

}
