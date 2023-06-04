package com.example.MinhPham1141.services;

import com.example.MinhPham1141.entity.Phongban;
import com.example.MinhPham1141.repository.IPhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongBanService {
    @Autowired
    private IPhongBanRepository phongBanRepository;
    public List<Phongban> getAllPhongBans() { return phongBanRepository.findAll(); }
    public  Phongban getPhongBanById(String maphongban){
        Optional<Phongban> optionalPhongban = phongBanRepository.findById(maphongban);
        if (optionalPhongban.isPresent()){
            return optionalPhongban.get();
        }else {
            throw new RuntimeException("PhongBan not found");
        }
    }
    public void addPhongBan(Phongban phongban){
        phongBanRepository.save(phongban);
    }
    public void updatePhongBan(Phongban phongban){
        phongBanRepository.save(phongban);
    }
    public  Phongban savePhongBan(Phongban phongban){
        return phongBanRepository.save(phongban);
    }

    public void deletePhongBan(String maphongban){phongBanRepository.deleteById(maphongban);}
}
