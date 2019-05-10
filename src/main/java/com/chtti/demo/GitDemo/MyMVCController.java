package com.chtti.demo.GitDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyMVCController {
    @RequestMapping(value = "/ep5")
    public String foo(@RequestParam(value = "name", required = false, defaultValue = "Alex") String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }

}
