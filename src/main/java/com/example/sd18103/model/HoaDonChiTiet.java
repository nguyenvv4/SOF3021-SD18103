package com.example.sd18103.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hoa_don_chi_tiet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonChiTiet {

    @EmbeddedId
    private IdHoaDonChiTiet id;

    private Integer soLuong;

    private Double donGia;
}
