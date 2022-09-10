package com.example.provider.mapper;

import com.example.model.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods row);

    int insertSelective(Goods row);

    Goods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods row);

    int updateByPrimaryKeyWithBLOBs(Goods row);

    int updateByPrimaryKey(Goods row);
}