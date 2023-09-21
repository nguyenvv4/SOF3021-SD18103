package com.example.sd18103.controller;

import com.example.sd18103.model.SinhVien;
import com.example.sd18103.service.SinhVienService;
import com.oracle.wls.shaded.org.apache.xpath.operations.Mod;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/sinh-vien")
@Controller
public class AppController {

    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/hien-thi")
//    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    public String hienThi(Model model) {
        ArrayList<SinhVien> list = sinhVienService.getAll();
        model.addAttribute("list", list);
        model.addAttribute("sinhVien", new SinhVien());
        return "index";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable String id, Model model) {
        model.addAttribute("sinhVien", sinhVienService.detail(id));
        return "detail";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable String id,
                         @RequestParam("username") String username,
                         @RequestParam("diaChi") String diaChi,
                         @RequestParam("gioiTinh") String gioiTinh) {
        sinhVienService.update(id, new SinhVien(username, diaChi, gioiTinh));
        return "redirect:/sinh-vien/hien-thi";
    }

    //    @PostMapping("/add")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("diaChi") String diaChi,
//                        @RequestParam("id") String id,
//                        @RequestParam("gioiTinh") String gioiTinh) {
//        sinhVienService.addNew(new SinhVien(id, username, gioiTinh, diaChi));
//        return "redirect:/sinh-vien/hien-thi";
//    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("sinhVien") SinhVien sinhVien,
                      BindingResult bindingResult,
                      Model model) {
//        sinhVienService.addNew();
//        return "redirect:/sinh-vien/hien-thi";
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", bindingResult.getFieldErrors());
            return "index";
        }
        sinhVienService.addNew(sinhVien);
        return "redirect:/sinh-vien/hien-thi";

    }
}
