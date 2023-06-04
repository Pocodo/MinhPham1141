package com.example.MinhPham1141.controller;

import com.example.MinhPham1141.entity.Nhanvien;
import com.example.MinhPham1141.services.NhanVienService;
import com.example.MinhPham1141.services.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhanviens")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private PhongBanService phongBanService;

    @GetMapping
    public String showAllNhanViens(Model model){
        List<Nhanvien> nhanviens = nhanVienService.getAllNhanViens();
        model.addAttribute("nhanviens",nhanviens);
        return "nhanvien/list";
    }
    @GetMapping("/add")
    public String addNhanVienForm(Model model){
        model.addAttribute("nhanvien", new Nhanvien());
        model.addAttribute("phongbans", phongBanService.getAllPhongBans());

        return "nhanvien/add";
    }

    @PostMapping("/add")
    public String addNhanVien(Nhanvien nhanvien){

        nhanVienService.addNhanVien(nhanvien);
        return "redirect:/nhanviens";
    }
    @GetMapping("/edit/{manv}")
    public String editNhanVienForm(@PathVariable("manv") String manv, Model model){
        Nhanvien editNhanVien = nhanVienService.getNhanVienById(manv);
        if (editNhanVien!=null){
            model.addAttribute("nhanvien", editNhanVien);
            model.addAttribute("phongbans", phongBanService.getAllPhongBans());
            return "nhanvien/edit";
        } else {
            return "not-found";
        }
    }
    @PostMapping("/edit")
    public  String editNhanVien( Nhanvien unhanvien,Model model){

        nhanVienService.updateNhanVien(unhanvien);
        return "redirect:/nhanviens";

    }



    @GetMapping("/delete/{manv}")
    public String deleteNhanVien(@PathVariable("manv") String manv){
        nhanVienService.deleteNhanVien(manv);
        return "redirect:/nhanviens";
    }
}
