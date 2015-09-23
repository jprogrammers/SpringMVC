package com.jprogrammers.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alireza on 9/23/15.
 */
@Controller
public class SimpleController {

    @ModelAttribute("message")
    public String addModelMethod(){
        return "Hey";
    }

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String handleRequest(){

        return "test";
    }

}
