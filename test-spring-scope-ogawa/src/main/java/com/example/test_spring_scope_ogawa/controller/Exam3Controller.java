package com.example.test_spring_scope_ogawa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam-bounus-input")
public class Exam3Controller {
    @Autowired
    private HttpSession session;
    
    @RequestMapping("")
    public String index(){
        return "exam-bounus-input";
    }

    @RequestMapping("/result")
    public String result(String address,String password,Model model){
        model.addAttribute("address",address);
        model.addAttribute("password",password);

        
        if(address.equals("yamada@sample.com") && password.equals("yamayama")){
            model.addAttribute("result","成功");
         
        }else{
            model.addAttribute("result","失敗");
            return "exam-bounus-input2";
        }
        return "exam-bounus-result";

    }
    @RequestMapping("/exam-bounus-result")
    public String result2(String name,String email,Integer age){
        session.setAttribute("name", name);
        session.setAttribute("email", email);
        session.setAttribute("age", age);
        return "exam-bounus-result";

    }

    
}
