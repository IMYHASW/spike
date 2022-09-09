package com.example.provider.mapper;

import com.example.model.MiaoShaGoods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MiaoShaGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MiaoShaGoods row);

    int insertSelective(MiaoShaGoods row);

    MiaoShaGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MiaoShaGoods row);

    int updateByPrimaryKey(MiaoShaGoods row);
}