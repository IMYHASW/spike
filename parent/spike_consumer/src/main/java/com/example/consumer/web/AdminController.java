package com.example.consumer.web;

import com.example.model.Admin;
import com.example.service.AdminService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller(value = "/admin")
@Controller
public class AdminController {


    @Reference(interfaceClass = AdminService.class,version = "1.0.0",check = false)
    private AdminService adminService;


    @RequestMapping(value = "/login")
    public String adminLogin(Model model,
                             @PathVariable("username") String username,
                             @PathVariable("password") String password){

        Admin admin = adminService.adminLogin(username, password);
        if (admin.getName().equals(username) && admin.getPwd().equals(password)){
            model.addAttribute("admin",admin);
            return "adminIndex";
        }else {
            return "账号或者秘密错误";
        }


    }
    @RequestMapping(value = "/test")
    public String test(){
        System.out.println("sss");
        return "sss";

    }

}
