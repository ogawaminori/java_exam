package com.example.test_spring_scope_ogawa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index(){
        return "exam02";
    }

    @RequestMapping("/result")
        public String add(Integer num1,Integer num2){
            session.setAttribute("num1", num1);
            session.setAttribute("num2", num2);
            Integer add=num1+num2;
            session.setAttribute("add", add);
            return "exam02-result";
    }

    @RequestMapping("/result1")
    public String result1(){
        return "exam02-result";
    }

    @RequestMapping("/result2")
    public String result2(){
        return "exam02-result2";
    }
    
}
