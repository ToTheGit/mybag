package kr.ac.gachon.shop.controller;

import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j

@Controller
public class MainController {
    @GetMapping("/")
    public String index(){
        return "main";
    }
}