package com.example.sd18103.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SinhVien {

    @NotBlank(message = "Khong de trong id")
    private String id;

    @NotBlank(message = "Name Khong de trong id")
    private String username;

    private String gioiTinh;

    private String diaChi;

    public SinhVien(String username, String gioiTinh, String diaChi) {
        this.username = username;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
}
