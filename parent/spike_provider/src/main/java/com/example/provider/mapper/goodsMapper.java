package com.example.provider.mapper;

import com.example.model.goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface goodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(goods row);

    int insertSelective(goods row);

    goods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(goods row);

    int updateByPrimaryKeyWithBLOBs(goods row);

    int updateByPrimaryKey(goods row);
}