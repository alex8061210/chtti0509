package com.chtti.demo.GitDemo.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Message {
    private int id;
    private String name;
    private static final Logger LOGGER = LoggerFactory.getLogger(Message.class);

    public Message() {
        id = 0;
        LOGGER.info("Generate a message object");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
