package com.ymmihw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymmihw.entity.Client;
import com.ymmihw.mapper.ClientMapper;
import com.ymmihw.service.ClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client> implements ClientService {

    @Autowired
    private ClientMapper clientMapper;

}