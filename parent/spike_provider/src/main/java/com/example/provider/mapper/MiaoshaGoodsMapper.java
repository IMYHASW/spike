package com.example.provider.mapper;

import com.example.model.MiaoshaGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MiaoshaGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MiaoshaGoods row);

    int insertSelective(MiaoshaGoods row);

    List<MiaoshaGoods> selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MiaoshaGoods row);

    int updateByPrimaryKey(MiaoshaGoods row);
}