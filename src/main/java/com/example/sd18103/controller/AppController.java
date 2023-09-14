package com.example.sd18103.controller;

import com.example.sd18103.model.SinhVien;
import com.example.sd18103.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/sinh-vien")
@Controller
public class AppController {

    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/hien-thi")
//    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    public String hienThi(Model model){
        ArrayList<SinhVien> list = sinhVienService.getAll();
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("username") String un){
        System.out.println("name : "+un);
        return "index";
    }

    @PostMapping("/add")
    public String login(@RequestParam("username") String username,
                        @RequestParam("diaChi") String diaChi,
                        @RequestParam("id") String id,
                        @RequestParam("gioiTinh") String gioiTinh){
        sinhVienService.addNew(new SinhVien(id,username,gioiTinh,diaChi));
        return "redirect:/sinh-vien/hien-thi";
    }
}
