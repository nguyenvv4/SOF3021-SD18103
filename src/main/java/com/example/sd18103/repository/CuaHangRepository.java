package com.example.sd18103.repository;

import com.example.sd18103.model.CuaHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {

    List<CuaHang> findByTenOrderByMaAsc(String ten);

    @Query(value = "SELECT * from cua_hang", nativeQuery = true)
    List<CuaHang> getAll();

    Page<CuaHang> findAll(Pageable pageable);
}
