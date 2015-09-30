package com.jprogrammers.spring.modelAndView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alireza on 9/23/15.
 */
@Controller
@RequestMapping("/modelAndView")
public class SimpleController {

    @ModelAttribute("message")
    public String addModelMethod(){
        return "Hey!";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String handleRequest(@ModelAttribute String message){

        System.out.println("the message is : " + message);

        return "index";
    }

}
