package com.example.provider.service.impl;

import com.example.model.Admin;
import com.example.provider.mapper.AdminMapper;
import com.example.service.AdminService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Service(interfaceClass = AdminService.class,version = "1.0.0",timeout = 15000)
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin adminLogin(String username) {


        Admin admin = adminMapper.selectByUsername(username);

        return admin;
    }
}