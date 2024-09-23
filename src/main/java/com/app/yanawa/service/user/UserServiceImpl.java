package com.app.yanawa.service.user;

import com.app.yanawa.domain.user.UserVO;
import com.app.yanawa.repository.user.UserDAO;
import jakarta.websocket.OnClose;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Primary
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

//    회원가입
    @Override
    public void join(UserVO userVO){userDAO.save(userVO);}



}
