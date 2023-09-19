package com.example.sd18103.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SinhVien {

    private String id;

    private String username;

    private String gioiTinh;

    private String diaChi;

    public SinhVien(String username, String gioiTinh, String diaChi) {
        this.username = username;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
}
