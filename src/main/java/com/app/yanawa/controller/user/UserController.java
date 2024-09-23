package com.app.yanawa.controller.user;

import com.app.yanawa.domain.user.UserDTO;
import com.app.yanawa.service.user.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/yanawa/*")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping("join")
    public void goTOJoinForm(UserDTO userDTO, HttpSession session) {;}

    @PostMapping("join")
    public RedirectView join(UserDTO userDTO) {
        userService.join(userDTO.toVO());

        return new RedirectView("/yanawa/email_login");
    }
}
