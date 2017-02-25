package com.logicbaker.mathutil.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloWorldController {
 
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    @ResponseBody
    public String sayHello(ModelMap model) {
         return "welcome";
    }
 
   
 
}