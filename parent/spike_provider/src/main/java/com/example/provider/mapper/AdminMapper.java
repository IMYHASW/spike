package com.example.provider.mapper;

import com.example.model.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin row);

    int insertSelective(Admin row);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin row);

    int updateByPrimaryKey(Admin row);

    Admin selectByUsername(String name);


}