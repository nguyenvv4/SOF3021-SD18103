package com.example.sd18103.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Report {

    @Id
    private String maHoaDon;
    private String ten;
    private String gioiTinh;
    private String ma;

    @Override
    public String toString() {
        return "Report{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ma='" + ma + '\'' +
                '}';
    }
}
