package com.example.MinhPham1141.services;

import com.example.MinhPham1141.entity.Nhanvien;
import com.example.MinhPham1141.repository.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class NhanVienService {
    @Autowired
    private INhanVienRepository nhanVienRepository;
    public List<Nhanvien> getAllNhanViens(){
        return nhanVienRepository.findAll();
    }
    public Nhanvien getNhanVienById(String manv){
        Optional<Nhanvien> optional = nhanVienRepository.findById(manv);
        return optional.orElse(null);
    }
    public void addNhanVien(Nhanvien nhanvien){
        nhanVienRepository.save(nhanvien);
    }
    public void updateNhanVien(Nhanvien nhanvien){
        nhanVienRepository.save(nhanvien);
    }
    public void deleteNhanVien(String manv){
        nhanVienRepository.deleteById(manv);
    }
}
