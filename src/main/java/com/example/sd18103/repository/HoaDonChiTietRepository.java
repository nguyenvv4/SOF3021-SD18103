package com.example.sd18103.repository;

import com.example.sd18103.model.HoaDonChiTiet;
import com.example.sd18103.model.IdHoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, IdHoaDonChiTiet> {
}
