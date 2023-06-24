package fplhn.it17333.controllers;

import fplhn.it17333.Login.User;
import fplhn.it17333.Repository.NguoiMuaHangRepo;
import fplhn.it17333.SPBan.NguoiMuaHang;
import fplhn.it17333.SPBan.SPBan;
import fplhn.it17333.request.Test;
import fplhn.it17333.viewsModel.SanPhamBanVM;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Controller
public class SanPhamBan {
private HttpServletRequest request;

    @Autowired
    private SanPhamBanVM test;

    @Autowired
    private NguoiMuaHangRepo nguoiMuaHangRepo;



    @RequestMapping("sp")
    private String get(Model model ){
        model.addAttribute("view","/views/SPBan/SPBan.jsp");
        NguoiMuaHang sp = new NguoiMuaHang();
        model.addAttribute("xn",sp);
        return "LayOut/layout";
    }

    @PostMapping("sp/store")
    private String push( Model model,@Valid @ModelAttribute("xn") NguoiMuaHang sp,
                         BindingResult result){

        if(result.hasErrors() ){
            model.addAttribute("view","/views/SPBan/SPBan.jsp");
            return "LayOut/layout";
        }else{
            Date n = new Date();
            String thoigianmua = n.getHours()+":"+n.getMinutes()+" Day: "+n.getDay()+"/"+n.getMonth()+"/"+n.getYear();
            //System.out.println(sp.getSoTien());
//            //send user
            String to = (sp.getEmail());
            String subject=("Đặt hàng thành công!");
            String text=("Cảm ơn bạn đã mua sản phẩm : "+sp.getTenSP() + ", Số lượng: "+ sp.getSoLuong()+ ", Số tiền: "+ sp.getSoTien()+"\n"
                    +"Địa chỉ: "+sp.getDiaChi() +"\n"
                    +"Số điện thoại: "+ sp.getSdt()+"\n"

                    +"Vui lòng thanh toán khi nhận hàng!"+"\n"
            );
            test.sendEmail(to,subject,text);
//send from admin
            String to2 = ("Thiencobklx@gmail.com");
            String subject2=("Đơn mua!");
            String text2=("Khách hàng đã mua sản phẩm : "+sp.getTenSP() + ", Số lượng: "+ sp.getSoLuong()+ ", Số tiền: "+ sp.getSoTien()+"\n"
                    +"Địa chỉ: "+sp.getDiaChi() +"\n"
                    +"Số điện thoại: "+ sp.getSdt()+"\n"

                    +"Vui lòng lên đơn!"+"\n"
            );
            test.sendEmail(to2,subject2,text2);
            sp.setThoiGianMua(thoigianmua);
            this.nguoiMuaHangRepo.save(sp);
            return "SPBan/thanhcong";
        }

    }

    @GetMapping("form")
    private String getFormXN(Model model ,@ModelAttribute("xn") NguoiMuaHang nh){
        //model.addAttribute("sp",sp);
        return "SPBan/form";
    }

@GetMapping("test")
private String testMail(){


    return "SPBan/thanhcong";
}




}
