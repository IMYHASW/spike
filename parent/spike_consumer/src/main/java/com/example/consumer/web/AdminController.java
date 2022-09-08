package com.example.consumer.web;

import com.example.model.Admin;
import com.example.service.AdminService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "/admin")
public class AdminController {


    @Reference(interfaceClass = AdminService.class,version = "1.0.0",check = false)
    private AdminService adminService;


    @RequestMapping(value = "/login/{username}/{password}")
    public String adminLogin(Model model,
                             @PathVariable("username") String username,
                             @PathVariable("password") String password){

        boolean pass = adminService.adminLogin(username, password);
        if (pass){

            Admin admin = new Admin();
            admin.setName(username);
            admin.setPwd(password);
            model.addAttribute("admin",admin);
            return "items";
        }

        return "adminLogin";
    }

}
