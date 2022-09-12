package com.example.service;

import com.example.model.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> selectList();

    List<Goods> selectByPrimaryKey(Long id);
}
