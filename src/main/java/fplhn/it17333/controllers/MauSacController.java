package fplhn.it17333.controllers;



import fplhn.it17333.Entity.MauSac;
import fplhn.it17333.Repository.MauSacRepo;

import fplhn.it17333.viewsModel.MauSacVM;
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
public class MauSacController {
    //private ArrayList<NhanVien> list = new ArrayList<>();

    @Autowired
    private MauSacRepo mauSacRepo;

    public MauSacController (){


    }

    @GetMapping("/mausac/create")
    public String getCreate(Model model){
        MauSacVM ctsp = new MauSacVM();
        model.addAttribute("view","/views/MauSac/create.jsp");
        model.addAttribute("ms",ctsp);
        model.addAttribute("action","/mausac/store");
        return "LayOut/layout";
    }

    @PostMapping ("/mausac/store")
    public String getStore(Model model,@Valid @ModelAttribute("ms") MauSacVM nv,
                           BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("view","/views/MauSac/create.jsp");
            return "LayOut/layout";
        }else {
            MauSac ct = new MauSac();
            ct.loadFromVM(nv);
            mauSacRepo.save(ct);
            return "redirect:/mausac/index";
        }
    }

    @GetMapping("/mausac/delete/{id}")
    public String getDelete(@PathVariable("id")MauSac ctsp){
        mauSacRepo.delete(ctsp);

        return "redirect:/mausac/index";
    }

    @GetMapping("/mausac/edit/{id}")
    public String getEdit(Model model,@PathVariable("id")MauSac ct,
                          @ModelAttribute("ms")  MauSacVM nv,BindingResult result){

        if (result.hasErrors()) {
            return "";
        }else {
            nv.loadFromEntity(ct);
            model.addAttribute("view","/views/MauSac/create.jsp");
            model.addAttribute("ms", nv);
            model.addAttribute("action", "/mausac/update/" + ct.getId());
            return "LayOut/layout";
        }
    }

    @PostMapping("/mausac/update/{id}")
    public String getUpdate(MauSacVM nv,@PathVariable("id") MauSac nhanVienEntity,Model model,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "MauSac/create";
        } else {
            nhanVienEntity.loadFromVM(nv);
            this.mauSacRepo.save(nhanVienEntity);


            return "redirect:/mausac/index";
        }
    }

    @GetMapping("/mausac/index")
    public String getIndex(Model model){
        model.addAttribute("view","/views/MauSac/index1.jsp");
        model.addAttribute("list",mauSacRepo.findAll());
        return "LayOut/layout";
    }
}
