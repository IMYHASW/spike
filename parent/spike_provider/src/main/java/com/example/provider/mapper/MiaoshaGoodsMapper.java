package com.example.provider.mapper;

import com.example.model.MiaoshaGoods;

import java.util.List;

public interface MiaoshaGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MiaoshaGoods row);

    int insertSelective(MiaoshaGoods row);

    List<MiaoshaGoods> selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MiaoshaGoods row);

    int updateByPrimaryKey(MiaoshaGoods row);
}