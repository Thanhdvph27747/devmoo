package fplhn.it17333.controllers;

import fplhn.it17333.Entity.NhanVienEntity;
import fplhn.it17333.Repository.NhanVienRepo;
import fplhn.it17333.viewsModel.CuaHang;
import fplhn.it17333.viewsModel.NhanVien;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Date;
import java.util.ArrayList;
@Controller
public class NhanVienController {
    private ArrayList<NhanVien> list = new ArrayList<>();

    @Autowired
    private NhanVienRepo nvres;

    public NhanVienController (){


    }

    @GetMapping("/nhanvien/create")
    public String getCreate(Model model){
        NhanVien nv= new NhanVien();
        model.addAttribute("view","/views/NhanVien/create.jsp");
        model.addAttribute("nv",nv);
        model.addAttribute("action","/nhanvien/store");
        return "LayOut/layout";
    }

    @PostMapping ("/nhanvien/store")
    public String getStore(Model model,@Valid @ModelAttribute("nv") NhanVien nv,
                           BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("view","/views/NhanVien/create.jsp");
            return "LayOut/layout";
        }else {
            NhanVienEntity nhanvien = new NhanVienEntity();
            nhanvien.setMa(nv.getMa());
            nhanvien.setTen(nv.getTen());
            nhanvien.setHo(nv.getHo());
            nhanvien.setDiaChi(nv.getDiaChi());
            nhanvien.setNgaySinh(nv.getNgaySinh());
            nhanvien.setSdt(nv.getSdt());
            nhanvien.setMatKhau(nv.getMatKhau());
            nhanvien.setGioiTinh(nv.getGioiTinh());
            nvres.save(nhanvien);
            return "redirect:/nhanvien/index";
}
    }

    @GetMapping("/nhanvien/delete/{id}")
    public String getDelete(@PathVariable("id")NhanVienEntity nhanVienEntity){
        nvres.delete(nhanVienEntity);

        return "redirect:/nhanvien/index";
    }

    @GetMapping("/nhanvien/edit/{id}")
    public String getEdit(Model model,@PathVariable("id")NhanVienEntity nhanVienEntity,
                          @ModelAttribute("nv")  NhanVien nv,BindingResult result){

        if (result.hasErrors()) {
            return "NhanVien/create";
        }else {
            nv.loadFromEmtity(nhanVienEntity);
            model.addAttribute("view","/views/NhanVien/create.jsp");
            model.addAttribute("nv", nv);
            model.addAttribute("action", "/nhanvien/update/" + nhanVienEntity.getId());
            return "LayOut/layout";
        }
    }

    @PostMapping("/nhanvien/update/{id}")
    public String getUpdate(NhanVien nv,@PathVariable("id") NhanVienEntity nhanVienEntity,Model model,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "NhanVien/create";
        } else {
            nhanVienEntity.loadFromVm(nv);
            this.nvres.save(nhanVienEntity);


            return "redirect:/nhanvien/index";
        }
    }

    @GetMapping("/nhanvien/index")
    public String getIndex(Model model){
        model.addAttribute("view","/views/NhanVien/index1.jsp");
        model.addAttribute("list",nvres.findAll());
        return "LayOut/layout";
    }
}
