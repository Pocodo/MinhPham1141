package com.example.MinhPham1141.repository;

import com.example.MinhPham1141.entity.Phongban;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongBanRepository extends JpaRepository<Phongban,String> {
}
