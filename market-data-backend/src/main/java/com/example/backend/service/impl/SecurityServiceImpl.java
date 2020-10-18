package com.example.backend.service.impl;

import com.example.backend.entity.Security;
import com.example.backend.mapper.SecurityMapper;
import com.example.backend.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("securityService")
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    private SecurityMapper securityMapper;

    @Override
    public Security find(String secuID) {
        return securityMapper.find(secuID);
    }
}
