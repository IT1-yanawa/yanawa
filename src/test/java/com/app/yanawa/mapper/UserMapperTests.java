package com.app.yanawa.mapper;

import com.app.yanawa.domain.user.UserDTO;
import com.app.yanawa.mapper.user.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("테스트1");
        userDTO.setUserEmail("test1@test.com");
        userDTO.setUserNickName("테스트1");
        userDTO.setUserPhone("01012345678");
        userDTO.setUserPassword("1234");
        userDTO.setUserGender("남");

        userMapper.insert(userDTO.toVO());
    }
}
