package com.chtti.demo.GitDemo.controllers;

import com.chtti.demo.GitDemo.beans.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Message message;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    Message index() {
        message.setId(message.getId() + 1);
        message.setName("Hello Alex");
        return message;
    }
}
