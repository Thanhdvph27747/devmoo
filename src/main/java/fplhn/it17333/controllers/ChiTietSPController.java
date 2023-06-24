package fplhn.it17333.controllers;



import fplhn.it17333.Entity.ChiTietSP;
import fplhn.it17333.Repository.ChiTietSPRepo;

import fplhn.it17333.viewsModel.ChiTietSPVM;
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
public class ChiTietSPController {
    //private ArrayList<NhanVien> list = new ArrayList<>();

    @Autowired
    private ChiTietSPRepo chiTietSPRepo;

    public ChiTietSPController (){

    }

    @GetMapping("/chitietsp/create")
    public String getCreate(Model model){
        ChiTietSPVM ctsp = new ChiTietSPVM();
        model.addAttribute("view","/views/ChiTietSP/create.jsp");
        model.addAttribute("ctsp",ctsp);
        model.addAttribute("action","/chitietsp/store");
        return "LayOut/layout";
    }

    @PostMapping ("/chitietsp/store")
    public String getStore(Model model,@Valid @ModelAttribute("ctsp") ChiTietSPVM nv,
                           BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("view","/views/ChiTietSP/create.jsp");
            return "LayOut/layout";
        }else {
            ChiTietSP ct = new ChiTietSP();
            ct.loadFromVM(nv);
            chiTietSPRepo.save(ct);
            return "redirect:/chitietsp/index";
        }
    }

    @GetMapping("/chitietsp/delete/{id}")
    public String getDelete(@PathVariable("id")ChiTietSP ctsp){
        chiTietSPRepo.delete(ctsp);

        return "redirect:/chitietsp/index";
    }

    @GetMapping("/chitietsp/edit/{id}")
    public String getEdit(Model model,@PathVariable("id")ChiTietSP ct,
                          @ModelAttribute("ctsp")  ChiTietSPVM nv,BindingResult result){


            nv.loadFromEntity(ct);
            model.addAttribute("view","/views/ChiTietSP/create.jsp");
            model.addAttribute("ctsp", nv);
            model.addAttribute("action", "/chitietsp/update/" + ct.getId());
            return "LayOut/layout";

    }


    @PostMapping("/chitietsp/update/{id}")
    public String getUpdate(ChiTietSPVM nv,@PathVariable("id") ChiTietSP nhanVienEntity,Model model,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "ChiTietSP/create";
        } else {
            nhanVienEntity.loadFromVM(nv);
            this.chiTietSPRepo.save(nhanVienEntity);


            return "redirect:/chitietsp/index";
        }
    }

    @GetMapping("/chitietsp/index")
    public String getIndex(Model model){
        model.addAttribute("view","/views/ChiTietSP/index1.jsp");
        model.addAttribute("list",chiTietSPRepo.findAll());
        return "LayOut/layout";
    }
}
