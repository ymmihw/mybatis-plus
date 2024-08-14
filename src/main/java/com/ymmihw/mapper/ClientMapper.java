package com.ymmihw.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ymmihw.entity.Client;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface ClientMapper extends BaseMapper<Client> {

}