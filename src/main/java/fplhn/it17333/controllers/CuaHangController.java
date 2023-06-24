package fplhn.it17333.controllers;

import fplhn.it17333.Entity.CuaHangEntity;
import fplhn.it17333.Repository.CuaHangReporitory;
import fplhn.it17333.viewsModel.CuaHang;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Controller
public class CuaHangController {
//    @Autowired
//    private CuaHang ch;

    private ArrayList<CuaHangEntity> chRes= new ArrayList<>();

    @Autowired
    private CuaHangReporitory chresss ;

    public CuaHangController(){


    }

    public CuaHangEntity findByMa(String Ma){
        for(CuaHangEntity ch:chRes){
            if(ch.getMa().equals(Ma)){
                return ch;
            }
        }
        return null;

    }

    @GetMapping("/cuahang/index")
    public String getIndex(Model model){
        model.addAttribute("view","/views/CuaHang/index.jsp");
        model.addAttribute("list",chresss.findAll());
        return "LayOut/layout";
    }

    @GetMapping("/cuahang/create")
    public String getCreate(Model model){
        CuaHang ch = new CuaHang();
        model.addAttribute("view","/views/CuaHang/create.jsp");
        model.addAttribute("ch",ch);
        model.addAttribute("action", "/cuahang/store");
        return "LayOut/layout";
    }

    @GetMapping("/cuahang/edit/{id}")
    public String getEdit(
            Model model,@PathVariable("id") CuaHangEntity cuaHang,
            @ModelAttribute("ch") CuaHang ch
    ){
        ch.loadFromEntity(cuaHang);
        model.addAttribute("view","/views/CuaHang/create.jsp");
        model.addAttribute("list",chresss);
        model.addAttribute("ch",ch);
        model.addAttribute("action", "/cuahang/update/" + cuaHang.getId());
        return "LayOut/layout";
    }
public void checkNull(){
        return;

}
    @PostMapping("/cuahang/store")
    public String getStore(Model model,@Valid @ModelAttribute("ch") CuaHang ch,
                          BindingResult result
                           ) {

            if(result.hasErrors()){
                model.addAttribute("view","/views/CuaHang/create.jsp");
                return "LayOut/layout";
            }else{
                fplhn.it17333.Entity.CuaHangEntity c = new fplhn.it17333.Entity.CuaHangEntity();
                c.setMa( ch.getMa() );
                c.setTen( ch.getTen() );
                c.setDiaChi( ch.getDiaChi() );
                c.setThanhPho( ch.getThanhPho() );
                c.setQuocGia( ch.getQuocGia() );
                chresss.save(c);

                return "redirect:/cuahang/index";
            }

           // return "redirect:/cuahang/index";

    }

    @PostMapping("/cuahang/update/{id}")
    public String getUpdate(CuaHang cuaHang,@PathVariable("id") CuaHangEntity cuaHangEntity,Model model) {
        cuaHangEntity.loadFromVM(cuaHang);
        this.chresss.save(cuaHangEntity);
        return "redirect:/cuahang/index";
    }

    @GetMapping("/cuahang/delete/{id}")
    public String getDelete(@PathVariable("id") CuaHangEntity cuaHang) {

        chresss.delete(cuaHang);

        return "redirect:/cuahang/index";
    }
}
