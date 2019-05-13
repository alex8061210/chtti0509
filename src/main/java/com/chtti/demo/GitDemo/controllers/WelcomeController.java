package com.chtti.demo.GitDemo.controllers;

import com.chtti.demo.GitDemo.beans.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    private Message message;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public Message index() {
        message.setId(message.getId() + 2);
        message.setName("Welcome back, Alex");
        return message;
    }
}
