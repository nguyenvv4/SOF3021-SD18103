package com.example.sd18103.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "hoa_don")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String ma;
}
