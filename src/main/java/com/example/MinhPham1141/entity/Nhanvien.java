package com.example.MinhPham1141.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="nhanvien")
public class Nhanvien {
    @Id

    private String manv;

    @Column(name = "tennv")
    private String tennv;

    @Column(name="phai")
    private String phai;

    @Column(name="noi sinh")
    private String noisinh;



    @Column(name="luong")
    private Long luong;
    @ManyToOne
    @JoinColumn(name="phongban_maphong",referencedColumnName = "maphong")
    private Phongban phongban;




}
