package com.endava.TaskMila.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sodobescu on 4/28/2017.
 */
@Controller
public class HelloController
{

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String getHello(){
        return "hello";
    }
}

