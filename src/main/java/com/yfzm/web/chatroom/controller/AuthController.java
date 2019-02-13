package com.yfzm.web.chatroom.controller;

import com.yfzm.web.chatroom.dto.auth.LoginForm;
import com.yfzm.web.chatroom.dto.base.BaseResponse;
import com.yfzm.web.chatroom.service.AuthService;
import com.yfzm.web.chatroom.service.SharedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Set;

@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private SharedService sharedService;

    @PostMapping("/auth/login")
    public BaseResponse login(@RequestBody LoginForm form, HttpSession session) {
        return authService.login(form);
    }

    @GetMapping("/onlineUsers")
    public Set<String> getOnlineUsers() {
        return sharedService.getOnlineUsers();
    }
}
