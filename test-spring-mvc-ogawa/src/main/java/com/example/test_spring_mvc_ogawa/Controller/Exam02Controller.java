package com.example.test_spring_mvc_ogawa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @RequestMapping("/showCompanyIntroduction")
    public String showCompanyIntroduction(){
        return "redilect:exam02/show-company-introduction";

    }

    @RequestMapping("/show-company-introduction")
    public String showCompanyIntroduction2(){
        return "exam02";
    }
}
