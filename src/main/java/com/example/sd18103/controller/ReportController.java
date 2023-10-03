package com.example.sd18103.controller;

import com.example.sd18103.model.Report;
import com.example.sd18103.model.SinhVien;
import com.example.sd18103.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/report")
@Controller
public class ReportController {

    @Autowired
    ReportRepository reportRepository;
    @GetMapping()
//    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    public String hienThi(Model model) {
        List<Report> list = reportRepository.getAll();
        list.forEach(x -> System.out.println(x.toString()));
        return null;
    }
}
