package com.ucky.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String sayHi(){
        return "hi there WEB - 1";
    }

    @RequestMapping("/jump-1")
    public String jumpToAnother(){
        return restTemplate.getForEntity("http://localhost:9111/jump-2",String.class).getBody();
    }


    @RequestMapping("/jump-2")
    public String jumpToAnother2(){
        return restTemplate.getForEntity("http://localhost:9222/hello",String.class).getBody();
    }

}
