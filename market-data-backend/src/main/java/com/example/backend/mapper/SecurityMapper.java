package com.example.backend.mapper;

import com.example.backend.entity.Security;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SecurityMapper {
    Security find(String secuID);
}
