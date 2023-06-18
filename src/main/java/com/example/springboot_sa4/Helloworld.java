package com.example.springboot_sa4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "hello ---- world ";
    }
}
