package com.example.test_spring_mvc_ogawa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/exam04")
public class Exam4Controller {
    

    @RequestMapping("")
    public String index(){
        return "exam03";
    }

    @RequestMapping("/info")
    public String info(String name, Model model){
        System.out.println("入力された値は"+name+"です");
        return "finished";
    }
    
}
    
