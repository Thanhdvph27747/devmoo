package fplhn.it17333.controllers;

import fplhn.it17333.Entity.NSX;
import fplhn.it17333.Repository.NSXRepo;
import fplhn.it17333.Repository.SanPhamRepo;
import fplhn.it17333.viewsModel.NSXVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NSXController {
    @Autowired
    private NSXRepo nsxRepo;


    @GetMapping("/nsx/create")
    public String getCreate(Model model){
        NSXVM ctsp = new NSXVM();
        model.addAttribute("view","/views/NSX/create.jsp");
        model.addAttribute("nsx",ctsp);
        model.addAttribute("action","/nsx/store");
        return "LayOut/layout";
    }

    @PostMapping("/nsx/store")
    public String getStore(Model model,@Valid @ModelAttribute("nsx") NSXVM nv,
                           BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("view","/views/NSX/create.jsp");
            return "LayOut/layout";
        }else {
            NSX ct = new NSX();
            ct.loadFromVM(nv);
            nsxRepo.save(ct);
            return "redirect:/nsx/index";
        }
    }

    @GetMapping("/nsx/delete/{id}")
    public String getDelete(@PathVariable("id")NSX ctsp){
        nsxRepo.delete(ctsp);

        return "redirect:/nsx/index";
    }

    @GetMapping("/nsx/edit/{id}")
    public String getEdit(Model model,@PathVariable("id")NSX ct,
                          @ModelAttribute("nsx")  NSXVM nv,BindingResult result){

        if (result.hasErrors()) {
            return "NSX/create";
        }else {
            nv.loadFromEntity(ct);
            model.addAttribute("view","/views/NSX/create.jsp");
            model.addAttribute("nsx", nv);
            model.addAttribute("action", "/nsx/update/" + ct.getId());
            return "LayOut/layout";
        }
    }

    @PostMapping("/nsx/update/{id}")
    public String getUpdate(NSXVM nv,@PathVariable("id") NSX nhanVienEntity,Model model,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "NSX/create";
        } else {
            nhanVienEntity.loadFromVM(nv);
            this.nsxRepo.save(nhanVienEntity);


            return "redirect:/nsx/index";
        }
    }

    @GetMapping("/nsx/index")
    public String getIndex(Model model){
        model.addAttribute("view","/views/NSX/index1.jsp");
        model.addAttribute("list",nsxRepo.findAll());
        return "LayOut/layout";
    }
}
