package com.example.provider.service.impl;

import com.example.model.MiaoshaGoods;
import com.example.provider.mapper.MiaoshaGoodsMapper;
import com.example.service.MiaoshaGoodsService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service(interfaceClass = MiaoshaGoodsService.class,version = "1.0.0",timeout = 15000)
public class MiaoShaGoodsServiceImpl implements MiaoshaGoodsService {
    @Resource
    private MiaoshaGoodsMapper miaoshaGoodsMapper;

    @Override
    public List<MiaoshaGoods> selectByID(Long id){
        return  miaoshaGoodsMapper.selectByPrimaryKey(id);
    }

}
