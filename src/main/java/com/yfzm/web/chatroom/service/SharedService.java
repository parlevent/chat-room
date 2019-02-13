package com.yfzm.web.chatroom.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SharedService {

    private Set<String> onlineUsers = new HashSet<>();

    public Set<String> getOnlineUsers() {
        return onlineUsers;
    }

    public void setOnlineUsers(Set<String> onlineUsers) {
        this.onlineUsers = onlineUsers;
    }

    public void addToOnlineUser(String username) {
        onlineUsers.add(username);
    }
}
