package com.example.sd18103.service.impl;

import com.example.sd18103.model.SinhVien;
import com.example.sd18103.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienServiceImpl() {
        listSinhVien.add(new SinhVien("Ph123", "Nguyen Van A","Nam", "Ha Noi"));
    }

    @Override
    public Boolean addNew(SinhVien sinhVien) {
        return listSinhVien.add(sinhVien);
    }

    @Override
    public ArrayList<SinhVien> getAll() {
        return listSinhVien;
    }
}
