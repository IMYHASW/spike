package com.example.consumer.web;

import com.example.model.MiaoshaGoods;
import com.example.model.goods;
import com.example.service.MiaoshaGoodsService;
import com.example.service.goodsService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller(value = "/spike")
public class MiaoshaGoodsController {
    @Reference(interfaceClass = MiaoshaGoodsService.class,version = "1.0.0",check = false)
    private MiaoshaGoodsService miaoshaGoodsService;

    @Reference(interfaceClass = goodsService.class,version = "1.0.0",check = false)
    private goodsService goodsservice;

    @RequestMapping(value = "/domain")
    public String selectByPrimaryKey(Long id, Model model){

        List<MiaoshaGoods> d = miaoshaGoodsService.selectByID(id);
        model.addAttribute("domain",d);
        System.out.print(d);

        List<goods> d2 = goodsservice.selectByPrimaryKey(id);
        model.addAttribute("detail",d2);
        System.out.print(d2);

        return "detail";
    }
}
