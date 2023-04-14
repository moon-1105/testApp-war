package com.mw1.testAppwar.controller;
import com.mw1.testAppwar.model.test;
import com.mw1.testAppwar.service.MainService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping("/")
@Log4j2
public class MainController {
    @GetMapping("/index")
    public String testPage(){
        return "index";
    }

    @GetMapping("/")
    public String mainPage(){
        return "main";
    }
}
