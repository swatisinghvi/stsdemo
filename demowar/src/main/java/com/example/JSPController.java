package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPController {

  @RequestMapping("/jsptest")
    public String test() {
        
        return "jsp-spring-boot";
  }
    
}