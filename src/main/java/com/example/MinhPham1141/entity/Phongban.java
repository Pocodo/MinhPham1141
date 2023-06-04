package com.example.MinhPham1141.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "phongban")
public class Phongban {
    @Id

    private String maphong;
    @Column(name = "ten phong")
    private String tenphong;

    @OneToMany(mappedBy = "phongban",cascade = CascadeType.ALL)
    private List<Nhanvien> nhanviens;

}
