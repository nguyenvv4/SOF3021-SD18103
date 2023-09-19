package com.example.sd18103.service;

import com.example.sd18103.model.SinhVien;

import java.util.ArrayList;

public interface SinhVienService {

    Boolean addNew(SinhVien sinhVien);

    ArrayList<SinhVien> getAll();

    SinhVien detail(String id);

    Boolean update(String id, SinhVien sinhVien);
}
