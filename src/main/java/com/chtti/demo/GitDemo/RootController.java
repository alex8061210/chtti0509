package com.chtti.demo.GitDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RootController.class);
    //@GetMapping(value = "/")
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String foo(){
        LOGGER.info("This is pretier comment.");
        //System.out.println("This is ugly comment.");
        return "[Get]Hello spring, check your console.";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String bar(){
        LOGGER.info("This is pretier comment.");
        //System.out.println("This is ugly comment.");
        return "[Post]Hello spring, check your console.";
    }
}
