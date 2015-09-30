package com.jprogrammers.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by alireza on 9/29/15.
 */
@Controller
public class MainController {


    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public ModelAndView handleRequest() {

        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("message" , "Hey");

        return modelAndView;
    }
}
