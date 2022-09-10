package com.example.service;

import com.example.model.goods;

import java.util.List;

public interface goodsService {
    List<goods> selectList();

    List<goods> selectByPrimaryKey(Long id);
}
