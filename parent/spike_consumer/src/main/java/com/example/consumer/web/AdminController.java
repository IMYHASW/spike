package com.example.consumer.web;

import com.example.model.Admin;

import com.example.model.Goods;
import com.example.service.AdminService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {


    @Reference(interfaceClass = AdminService.class,version = "1.0.0",check = false)
    private AdminService adminService;

    @RequestMapping(value = "/adminLogin")
    public String adminLogin(Model model){

        model.addAttribute("admin",new Admin());
        return "adminLogin";
    }
    @RequestMapping(value = "/goods_manage")
    public String goods_manage(Model model){

        return "goods_manage";
    }

    @RequestMapping(value = "/goods_add")
    public String goods_add(Model model){

        return "goods_add";
    }

    @RequestMapping(value = "/loginCheck")
    public String adminLogin1(@ModelAttribute Admin admin){

        String username = admin.getName();
        String password = admin.getPwd();
        Admin admin2 = adminService.adminLogin(username);
        if (admin.getName().equals(admin2.getName()) && admin.getPwd().equals(admin2.getPwd())){

            admin.setId(admin2.getId());

            //获取商品
            Goods goods = new Goods();

            return "adminIndex";
        }else {
            return "adminLogin";
        }
    }

}
