package com.example.sd18103.controller;

import com.example.sd18103.model.CuaHang;
import com.example.sd18103.model.SinhVien;
import com.example.sd18103.repository.CuaHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

//    @GetMapping("/hien-thi")
////    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
//    public String hienThi(Model model) {
//        List<CuaHang> list = cuaHangRepository.getAll();
//        list.forEach(x -> System.out.println(x.toString()));
//        String tenCuaHang = "Ngan beo";
//        List<CuaHang> getByName = cuaHangRepository.findByTenOrderByMaAsc(tenCuaHang);
////        getByName.forEach(x -> System.out.println(x.toString()));
//        return null;
//    }

    @GetMapping("/hien-thi")
//    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    public ResponseEntity hienThi(Model model,
                                  Pageable pageable) {
        Page<CuaHang> page = cuaHangRepository.findAll(pageable);
        return new ResponseEntity(page, HttpStatus.OK);
    }

    @GetMapping("/add")
//    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    public String add(Model model) {
        // save 1 ban ghi
//        CuaHang cuaHang = new CuaHang();
//        cuaHang.setMa("CH13");
//        cuaHang.setTen("Hung baba");
//        cuaHang.setDiaChi("Ha noi");
//        cuaHang.setThanhPho("ha noi");
//        cuaHang.setQuocGia("viet nam");
//
//        cuaHangRepository.save(cuaHang);

        // save nhieu ban ghi
        CuaHang cuaHang = new CuaHang();
        cuaHang.setMa("CH14");
        cuaHang.setTen("Hung baba");
        cuaHang.setDiaChi("Ha noi");
        cuaHang.setThanhPho("ha noi");
        cuaHang.setQuocGia("viet nam");

        CuaHang cuaHang2 = new CuaHang();
        cuaHang2.setMa("CH15");
        cuaHang2.setTen("Hung baba");
        cuaHang2.setDiaChi("Ha noi");
        cuaHang2.setThanhPho("ha noi");
        cuaHang2.setQuocGia("viet nam");
        List<CuaHang> list = new ArrayList<>();
        list.add(cuaHang);
        list.add(cuaHang2);

        cuaHangRepository.saveAll(list);

        return null;
    }
}
