package com.example.sd18103.controller;

import com.example.sd18103.model.CuaHang;
import com.example.sd18103.model.SinhVien;
import com.example.sd18103.repository.CuaHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/cua-hang")
@Controller
public class CuaHangController {


    @Autowired
    private CuaHangRepository cuaHangRepository;

    @GetMapping("/hien-thi")
//    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    public String hienThi(Model model) {
        List<CuaHang> list = cuaHangRepository.getAll();
        list.forEach(x -> System.out.println(x.toString()));
        String tenCuaHang = "Ngan beo";
        List<CuaHang> getByName = cuaHangRepository.findByTenOrderByMaAsc(tenCuaHang);
//        getByName.forEach(x -> System.out.println(x.toString()));
        return null;
    }
}
