package fplhn.it17333.controllers;



import fplhn.it17333.Entity.SanPham;
import fplhn.it17333.Repository.SanPhamRepo;

import fplhn.it17333.viewsModel.SanPhamVM;
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
public class SanPhamController {
    //private ArrayList<NhanVien> list = new ArrayList<>();

    @Autowired
    private SanPhamRepo sanPhamRepo;


    @GetMapping("/sanpham/create")
    public String getCreate(Model model){
        SanPhamVM ctsp = new SanPhamVM();
        model.addAttribute("view","/views/SanPham/create.jsp");
        model.addAttribute("sp",ctsp);
        model.addAttribute("action","/sanpham/store");
        return "LayOut/layout";
    }

    @PostMapping ("/sanpham/store")
    public String getStore(Model model,@Valid @ModelAttribute("sp") SanPhamVM nv,
                           BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("view","/views/SanPham/create.jsp");
            return "LayOut/layout";
        }else {
            SanPham ct = new SanPham();
            ct.loadFromVM(nv);
            sanPhamRepo.save(ct);
            return "redirect:/sanpham/index";
        }
    }

    @GetMapping("/sanpham/delete/{id}")
    public String getDelete(@PathVariable("id")SanPham ctsp){
        sanPhamRepo.delete(ctsp);

        return "redirect:/sanpham/index";
    }

    @GetMapping("/sanpham/edit/{id}")
    public String getEdit(Model model,@PathVariable("id")SanPham ct,
                          @ModelAttribute("sp")  SanPhamVM nv,BindingResult result){

        if (result.hasErrors()) {
            return "SanPham/create";
        }else {
            nv.loadFromEntity(ct);
            model.addAttribute("view","/views/SanPham/create.jsp");
            model.addAttribute("sp", nv);
            model.addAttribute("action", "/sanpham/update/" + ct.getId());
            return "LayOut/layout";
        }
    }

    @PostMapping("/sanpham/update/{id}")
    public String getUpdate(SanPhamVM nv,@PathVariable("id") SanPham nhanVienEntity,Model model,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "SanPham/create";
        } else {
            nhanVienEntity.loadFromVM(nv);
            this.sanPhamRepo.save(nhanVienEntity);


            return "redirect:/sanpham/index";
        }
    }

    @GetMapping("/sanpham/index")
    public String getIndex(Model model){
        model.addAttribute("view","/views/SanPham/index1.jsp");
        model.addAttribute("list",sanPhamRepo.findAll());
        return "LayOut/layout";
    }
}
