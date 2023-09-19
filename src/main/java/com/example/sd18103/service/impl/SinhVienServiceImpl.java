package com.example.sd18103.service.impl;

import com.example.sd18103.model.SinhVien;
import com.example.sd18103.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienServiceImpl() {
        listSinhVien.add(new SinhVien("Ph123", "Nguyen Van A", "Nam", "Ha Noi"));
    }

    @Override
    public Boolean addNew(SinhVien sinhVien) {
        return listSinhVien.add(sinhVien);
    }

    @Override
    public ArrayList<SinhVien> getAll() {
        return listSinhVien;
    }

    @Override
    public SinhVien detail(String id) {
        SinhVien sinhVien = new SinhVien();
        for (SinhVien sv : listSinhVien) {
            if (sv.getId().equals(id)) {
                sinhVien = sv;
            }
        }
        return sinhVien;
    }

    @Override
    public Boolean update(String id, SinhVien sinhVien) {
        for (SinhVien sv : listSinhVien){
            if (sv.getId().equals(id)){
                sv.setUsername(sinhVien.getUsername());
                sv.setGioiTinh(sinhVien.getGioiTinh());
                sv.setDiaChi(sinhVien.getDiaChi());

            }
        }
        return true;
    }
}
