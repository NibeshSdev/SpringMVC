package com.asterdio.controller;

/**
 * Created by Admin on 11/26/2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        String message;
        message = "HELLO SPRING MVC HOW R U";
        return new ModelAndView("hellopage", "message", message);
    }

}

