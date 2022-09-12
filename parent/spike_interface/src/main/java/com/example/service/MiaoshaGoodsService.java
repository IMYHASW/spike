package com.example.service;
import com.example.model.MiaoshaGoods;

import java.util.List;

public interface MiaoshaGoodsService {
    List<MiaoshaGoods> selectByID(Long id);
}
