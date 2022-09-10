package com.example.provider.mapper;

import com.example.model.goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface goodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(goods row);

    int insertSelective(goods row);

    List<goods> selectByPrimaryKey(Long id);

    List<goods> selectList();

    int updateByPrimaryKeySelective(goods row);

    int updateByPrimaryKeyWithBLOBs(goods row);

    int updateByPrimaryKey(goods row);
}