package com.learn.spring.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Configuration
@RequestMapping("/")
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap model) {
        model.addAttribute("greeting", "Hello World");
        return "welcome";
    }
 
    @RequestMapping(value = "/again", method = RequestMethod.GET)
    public String helloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again");
        return "welcome";
    }

}
