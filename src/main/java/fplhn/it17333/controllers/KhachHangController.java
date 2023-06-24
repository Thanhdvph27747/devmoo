package fplhn.it17333.controllers;

import fplhn.it17333.Entity.CuaHangEntity;
import fplhn.it17333.Repository.KhachHangRepo;
import fplhn.it17333.viewsModel.KhachHang;
import fplhn.it17333.viewsModel.NhanVien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.URI;
import java.util.ArrayList;

@Controller
public class KhachHangController {
    private ArrayList<KhachHang> list = new ArrayList<>();

private HttpServletRequest request ;


    @Autowired
    private KhachHangRepo khachHangRepo;
    public KhachHangController (){


    }
    public KhachHang findByMa(String ma){
        for(KhachHang nv:list){
            if(nv.getMa().equals(ma)){
                return nv;
            }
        }
        return null;

    }
    @GetMapping("/khachhang/create")
    public String getCreate(Model model){
        KhachHang kh = new KhachHang();

        model.addAttribute("kh",kh);
        model.addAttribute("action","/khachhang/store");
        model.addAttribute("view","/views/KhachHang/save.jsp");
        return "LayOut/layout";
    }

    @PostMapping("/khachhang/store")
    public String getStore(Model model,@Valid @ModelAttribute("kh") KhachHang ch,
                           BindingResult result){
if(result.hasErrors()){
    model.addAttribute("view","/views/KhachHang/save.jsp");
    return "LayOut/layout";
}else {
    fplhn.it17333.Entity.KhachHang k = new fplhn.it17333.Entity.KhachHang();
    k.loadFromVM(ch);
    khachHangRepo.save(k);
    System.out.println("Thêm thành công");
    System.out.println(k.getMa());
    return "redirect:/khachhang/index";
}
    }

    @GetMapping("/khachhang/delete/{id}")
    public String getDelete(@PathVariable("id")fplhn.it17333.Entity.KhachHang kh){
        khachHangRepo.delete(kh);

        return "redirect:/khachhang/index";
    }

    @GetMapping("/khachhang/edit/{id}")
    public String getEdit(@ModelAttribute("kh") KhachHang khvm,Model model, @PathVariable("id") fplhn.it17333.Entity.KhachHang ch
                          ){
        model.addAttribute("view","/views/KhachHang/save.jsp");
        khvm.loadFromEntity(ch);
        model.addAttribute("kh",khvm);

        model.addAttribute("action","/khachhang/update/"+ ch.getId());

        return "LayOut/layout";
    }

    @PostMapping("/khachhang/update/{id}")
    public String getUpdate(KhachHang nv,@PathVariable("id") fplhn.it17333.Entity.KhachHang kh){
        kh.loadFromVM(nv);
        this.khachHangRepo.save(kh);
        return "redirect:/khachhang/index";
    }

    @GetMapping("/khachhang/index")
    public String getIndex(Model model){
        model.addAttribute("view","/views/KhachHang/index.jsp");

        //request.setAttribute("view","/KhachHang/index.jsp");
        model.addAttribute("list",khachHangRepo.findAll());
        return "LayOut/layout";

    }
}
