package com.example.consumer.web;

import com.example.model.Goods;
import com.example.service.GoodsService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller(value = "/goods")
public class GoodsController {

    @Reference(interfaceClass = GoodsService.class,version = "1.0.0",check = false)
    private GoodsService goodsservice;

    @RequestMapping(value = "/list")
    public String goodsList(Model model){
        List<Goods> g = goodsservice.selectList();
        model.addAttribute("goods",g);
        return "homepage";
    }

}
