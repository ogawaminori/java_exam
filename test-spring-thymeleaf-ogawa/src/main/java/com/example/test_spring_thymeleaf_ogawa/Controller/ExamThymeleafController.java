package com.example.test_spring_thymeleaf_ogawa.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam")
public class ExamThymeleafController {

    @RequestMapping("")
    public String form(){
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/result")
    public String result(Model model,String name,Integer age,List<String> hobbyList){
        
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        model.addAttribute("hobbyList",hobbyList);
        return "ex-thymeleaf-result";
    }
    
}
