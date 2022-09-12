package com.example.provider.mapper;

import com.example.model.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods row);

    int insertSelective(Goods row);

    List<Goods> selectByPrimaryKey(Long id);

    List<Goods> selectList();

    int updateByPrimaryKeySelective(Goods row);

    int updateByPrimaryKeyWithBLOBs(Goods row);

    int updateByPrimaryKey(Goods row);
}