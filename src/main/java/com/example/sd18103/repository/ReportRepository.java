package com.example.sd18103.repository;

import com.example.sd18103.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface ReportRepository extends JpaRepository<Report, String> {

    @Query(value = "SELECT nv.ma, nv.ten, nv.gioi_tinh , hd.ma as ma_hoa_don\n" +
            "FROM nhan_vien nv JOIN hoa_don hd\n" +
            "ON nv.id = hd.id_nv", nativeQuery = true)
    List<Report> getAll();
}
