package com.example.provider.mapper;

import com.example.model.MiaoshaGoods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MiaoShaGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MiaoshaGoods row);

    int insertSelective(MiaoshaGoods row);

    MiaoshaGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MiaoshaGoods row);

    int updateByPrimaryKey(MiaoshaGoods row);
}