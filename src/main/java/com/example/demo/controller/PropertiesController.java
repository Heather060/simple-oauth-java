//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class PropertiesController {
//    private String secret1;
//    private String secret2;
//
//
//
//    public PropertiesController(@Value("${spring.security.oauth2.client.registration.github.clientId}") String secret1,
//                                @Value("${spring.security.oauth2.client.registration.github.clientSecret}") String secret2) {
//        this.secret1 = secret1;
//        this.secret2 = secret2;
//
//        System.out.println(this.secret1);
//        System.out.println(this.secret2);
//    }
//
//    @GetMapping
//    public String helloWorld() {
//        return "AAAAAAAAAA";
//    }
//}
