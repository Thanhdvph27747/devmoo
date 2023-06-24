package fplhn.it17333.controllers;



import fplhn.it17333.Entity.DongSP;
import fplhn.it17333.Repository.DongSPRepo;

import fplhn.it17333.viewsModel.DongSPVM;
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
public class DongSPController {
    //private ArrayList<NhanVien> list = new ArrayList<>();

    @Autowired
    private DongSPRepo dongSPRepo;

    public DongSPController (){


    }

    @GetMapping("/dongsp/create")
    public String getCreate(Model model){
        DongSPVM ctsp = new DongSPVM();
        model.addAttribute("view","/views/DongSP/create.jsp");
        model.addAttribute("dongsp",ctsp);
        model.addAttribute("action","/dongsp/store");
        return "LayOut/layout";
    }

    @PostMapping ("/dongsp/store")
    public String getStore(Model model,@Valid @ModelAttribute("dongsp") DongSPVM nv,
                           BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("view","/views/DongSP/create.jsp");
            return "LayOut/layout";
        }else {
            DongSP ct = new DongSP();
            ct.loadFromVM(nv);
            dongSPRepo.save(ct);
            return "redirect:/dongsp/index";
        }
    }

    @GetMapping("/dongsp/delete/{id}")
    public String getDelete(@PathVariable("id")DongSP ctsp){
        dongSPRepo.delete(ctsp);

        return "redirect:/dongsp/index";
    }

    @GetMapping("/dongsp/edit/{id}")
    public String getEdit(Model model,@PathVariable("id")DongSP ct,
                          @ModelAttribute("dongsp")  DongSPVM nv,BindingResult result){

        if (result.hasErrors()) {
            return "DongSP/create";
        }else {
            nv.loadFromEntity(ct);
            model.addAttribute("view","/views/DongSP/create.jsp");
            model.addAttribute("dongsp", nv);
            model.addAttribute("action", "/dongsp/update/" + ct.getId());
            return "LayOut/layout";
        }
    }

    @PostMapping("/dongsp/update/{id}")
    public String getUpdate(DongSPVM nv,@PathVariable("id") DongSP nhanVienEntity,Model model,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "DongSP/create";
        } else {
            nhanVienEntity.loadFromVM(nv);
            this.dongSPRepo.save(nhanVienEntity);


            return "redirect:/dongsp/index";
        }
    }

    @GetMapping("/dongsp/index")
    public String getIndex(Model model){
        model.addAttribute("view","/views/DongSP/index1.jsp");
        model.addAttribute("list",dongSPRepo.findAll());
        return "LayOut/layout";
    }
}
