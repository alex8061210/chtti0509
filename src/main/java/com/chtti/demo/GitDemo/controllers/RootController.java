package com.chtti.demo.GitDemo.controllers;

import com.chtti.demo.GitDemo.beans.Lesson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RootController.class);

    //@GetMapping(value = "/")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String foo() {
        LOGGER.info("This is pretier comment.");
        //System.out.println("This is ugly comment.");
        return "[Get]Hello spring, check your console.";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String bar() {
        LOGGER.info("This is pretier comment.");
        //System.out.println("This is ugly comment.");
        return "[Post]Hello spring, check your console.";
    }

    @RequestMapping(value = "/ep1", method = RequestMethod.GET)
    public String ep1() {
        return "This is endpoint1";
    }

    @RequestMapping(value = "/ep2", method = RequestMethod.GET)
    public String ep2() {
        return "This is endpoint2";
    }

    @RequestMapping(value = "/ep3", method = RequestMethod.GET)
    public Lesson ep3() {
        Lesson lesson = new Lesson("Java OO", "MarkHo", 28);
        lesson.addSchedule("Apr-4");
        lesson.addSchedule("Apr-5");
        return lesson;
    }

    @RequestMapping(value = "/ep4", method = RequestMethod.GET)
    public Lesson ep4() {
        return new Lesson("R caret", "MarkHo", 35);
    }

}
