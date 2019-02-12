package com.yfzm.web.chatroom.controller;

import com.yfzm.web.chatroom.dto.auth.LoginForm;
import com.yfzm.web.chatroom.dto.base.BaseResponse;
import com.yfzm.web.chatroom.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/auth/login")
    public BaseResponse login(@RequestBody LoginForm form, HttpSession session) {
        return authService.login(form);
    }
}
