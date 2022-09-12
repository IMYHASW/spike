package com.example.provider.service.impl;

import com.example.model.Goods;
import com.example.provider.mapper.GoodsMapper;
import com.example.service.GoodsService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service(interfaceClass = GoodsService.class,version = "1.0.0",timeout = 15000)
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsmapper;
    @Override
    public List<Goods> selectList(){
        return goodsmapper.selectList();
    }
    @Override
    public List<Goods> selectByPrimaryKey(Long id){
        return goodsmapper.selectByPrimaryKey(id);
    }
}
