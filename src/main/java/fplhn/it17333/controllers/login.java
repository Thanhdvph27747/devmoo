package fplhn.it17333.controllers;

import fplhn.it17333.Login.User;
import fplhn.it17333.request.Account;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class login {
    @RequestMapping("login")
    public String hello(Model model){
String ten = "nguyen van a";
model.addAttribute("ten",ten);
        return "login";
    }
    //post dl tu form
    @PostMapping("login/store")
    public String login(
            @RequestParam("email") String email,
            @RequestParam("pass") String pass,

            Model model, @Valid @ModelAttribute("form")User acc,
            BindingResult result, HttpServletRequest request
            ) {
        if (result.hasErrors()) {
            return "login";
        } else {
            //String a = request.getParameter("aname");
            //System.out.println(a);


            System.out.println(email);
            if (acc.getEmail().equals("Thanhdvph27747") &&
                    acc.getPass().equals("Anhanh123")) {
                return "LayOut/layout";
            }
            return "redirect:/khachhang/index";
        }

    }

}
