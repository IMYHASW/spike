package com.example.provider.service.impl;

import com.example.model.goods;
import com.example.provider.mapper.goodsMapper;
import com.example.service.goodsService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service(interfaceClass = goodsService.class,version = "1.0.0",timeout = 15000)
public class goodsServiceImpl implements goodsService {
    @Resource
    private goodsMapper goodsmapper;
    @Override
    public List<goods> selectList(){
        return goodsmapper.selectList();
    }
    @Override
    public List<goods> selectByPrimaryKey(Long id){
        return goodsmapper.selectByPrimaryKey(id);
    }
}
