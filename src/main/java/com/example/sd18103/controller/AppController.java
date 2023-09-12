package com.example.sd18103.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/demo")
@Controller
public class AppController {

    @GetMapping("/hien-thi")
//    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    public String hienThi(){
        return "index";
    }
}
