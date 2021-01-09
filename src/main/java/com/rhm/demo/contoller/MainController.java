package com.rhm.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("")
    public String home(){
        return "index";
    }


    @RequestMapping("/home")
    public String home2(Model model, @RequestParam(value="n") String name){

        model.addAttribute("name", name);
        return "index2";
    }
}