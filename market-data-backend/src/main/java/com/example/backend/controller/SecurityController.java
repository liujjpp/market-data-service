package com.example.backend.controller;

import com.alibaba.fastjson.JSON;
import com.example.backend.entity.Security;
import com.example.backend.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @RequestMapping("/find")
    public String find(String secuID) {
        Security security = securityService.find(secuID);
        String securityJSON = JSON.toJSONString(security);
        return securityJSON;
    }
}
