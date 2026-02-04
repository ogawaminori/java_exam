package com.example.test_spring_mvc_ogawa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_ogawa.Form.Exam03Form;



@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
    @ModelAttribute
    public Exam03Form setUpForm(){
        return new Exam03Form();
    }



    @RequestMapping("")
    public String index(){
        return "exam03";
    }

    @RequestMapping("/info")
    public String info(Exam03Form exam03Form){
        System.out.println("入力された値は"+exam03Form.getName()+"です");
        return "finished";
    }
    
}
