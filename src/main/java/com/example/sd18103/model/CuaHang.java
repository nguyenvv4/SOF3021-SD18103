package com.example.sd18103.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "cua_hang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuaHang {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String ma;

    private String ten;

    private String diaChi;

    private String thanhPho;

    private String quocGia;

    @Override
    public String toString() {
        return "CuaHang{" +
                "id=" + id +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", thanhPho='" + thanhPho + '\'' +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}
