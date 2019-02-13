package com.yfzm.web.chatroom.service;

import com.yfzm.web.chatroom.dao.UserDao;
import com.yfzm.web.chatroom.dto.auth.LoginForm;
import com.yfzm.web.chatroom.dto.base.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    private SharedService sharedService;

    public BaseResponse login(LoginForm form) {
        boolean ok = userDao.existsByUsernameAndPassword(form.getUsername(), form.getPassword());
        if (ok) {
            sharedService.addToOnlineUser(form.getUsername());
            template.convertAndSend("/topic/login", sharedService.getOnlineUsers());
        }
        return new BaseResponse(ok);
    }
}
