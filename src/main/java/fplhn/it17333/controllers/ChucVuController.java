package fplhn.it17333.controllers;



import fplhn.it17333.Entity.ChucVu;
import fplhn.it17333.Repository.ChucVuRepo;

import fplhn.it17333.viewsModel.ChucVuVM;
import jakarta.servlet.http.HttpServletRequest;
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
public class ChucVuController {
    private HttpServletRequest request;
    //private ArrayList<NhanVien> list = new ArrayList<>();

    @Autowired
    private ChucVuRepo chucVuRepo;

    public ChucVuController (){


    }

    @GetMapping("/chucvu/create")
    public String getCreate(Model model){
        ChucVuVM ctsp = new ChucVuVM();
        model.addAttribute("view","/views/ChucVu/create.jsp");
        model.addAttribute("cv",ctsp);
        model.addAttribute("action","/chucvu/store");
        return "LayOut/layout";
    }

    @PostMapping ("/chucvu/store")
    public String getStore(Model model,@Valid @ModelAttribute("cv") ChucVuVM nv,
                           BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("view","/views/ChucVu/create.jsp");
            return "LayOut/layout";
        }else {
            ChucVu ct = new ChucVu();
            ct.loadFromVM(nv);
            this.chucVuRepo.save(ct);
        //    String a = request.getParameter("ma");
         //   System.out.println(a);
            return "redirect:/chucvu/index";
        }
    }

    @GetMapping("/chucvu/delete/{id}")
    public String getDelete(@PathVariable("id")ChucVu ctsp){
        chucVuRepo.delete(ctsp);

        return "redirect:/chucvu/index";
    }

    @GetMapping("/chucvu/edit/{id}")
    public String getEdit(@PathVariable("id")ChucVu ct,Model model
                         ){
        ChucVuVM chucVuVM = new ChucVuVM();
        chucVuVM.loadFromEntity(ct);
        model.addAttribute("cv",chucVuVM);
        model.addAttribute("action","/chucvu/update/"+ct.getId());
        return "Layout/layout";


//        if (result.hasErrors()) {
//
//            model.addAttribute("view", "/views/ChucVu/create.jsp");
//            return "Layout/layout";
//        }else {
//            nv.loadFromEntity(ct);
//            model.addAttribute("view","/views/ChucVu/create.jsp");
//            model.addAttribute("cv", nv);
//            model.addAttribute("action", "/chucvu/update/" + ct.getId());
//            return "LayOut/layout";

    }

    @PostMapping("/chucvu/update/{id}")
    public String getUpdate(ChucVuVM nv,@PathVariable("id") ChucVu nhanVienEntity,Model model,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "ChucVu/create";
        } else {
            nhanVienEntity.loadFromVM(nv);
            this.chucVuRepo.save(nhanVienEntity);


            return "redirect:/chucvu/index";
        }
    }

    @GetMapping("/chucvu/index")
    public String getIndex(Model model){
        model.addAttribute("list",chucVuRepo.findAll());
        model.addAttribute("view","/views/ChucVu/index1.jsp");
        return "LayOut/layout";
    }
}
