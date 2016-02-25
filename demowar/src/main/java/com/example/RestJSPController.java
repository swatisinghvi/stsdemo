package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestJSPController {

  @RequestMapping("/jsptest11")
    public String test() {
        
        return "jsp-spring-boot";
  }
    
}