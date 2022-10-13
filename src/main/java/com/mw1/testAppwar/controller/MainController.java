package com.mw1.testAppwar.controller;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
@Log4j2
public class MainController {
    @GetMapping("/index")
    public String testPage(){
        return "index";
    }
    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("data", "컨트롤러 데이터 테스트");
        return "main";
    }
}
