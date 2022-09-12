package com.example.consumer.web;

import com.example.model.goods;
import com.example.service.goodsService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller(value = "/goods")
public class goodsController {

    @Reference(interfaceClass = goodsService.class,version = "1.0.0",check = false)
    private goodsService goodsservice;

    @RequestMapping(value = "/list")
    public String goodsList(Model model){
        List<goods> g = goodsservice.selectList();
        model.addAttribute("goods",g);
        return "homepage";
    }

}
