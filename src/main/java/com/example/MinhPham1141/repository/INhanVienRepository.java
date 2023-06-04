package com.example.MinhPham1141.repository;

import com.example.MinhPham1141.entity.Nhanvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INhanVienRepository extends JpaRepository<Nhanvien,String>{

}
