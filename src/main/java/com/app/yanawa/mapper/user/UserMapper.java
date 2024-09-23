package com.app.yanawa.mapper.user;

import com.app.yanawa.domain.user.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
//    회원가입
    public void insert(UserVO userVO);
    
}
