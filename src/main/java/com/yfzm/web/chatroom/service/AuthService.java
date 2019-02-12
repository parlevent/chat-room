package com.yfzm.web.chatroom.service;

import com.yfzm.web.chatroom.dao.UserDao;
import com.yfzm.web.chatroom.dto.auth.LoginForm;
import com.yfzm.web.chatroom.dto.base.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserDao userDao;

    public BaseResponse login(LoginForm form) {
        return new BaseResponse(userDao.existsByUsernameAndPassword(form.getUsername(), form.getPassword()));
    }
}
