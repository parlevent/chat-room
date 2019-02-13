package com.yfzm.web.chatroom.controller;

import com.yfzm.web.chatroom.dto.chat.InMsg;
import com.yfzm.web.chatroom.dto.chat.OutMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
public class ChatController {

    @Autowired
    SimpMessagingTemplate template;

    @MessageMapping("/sendMsg")
    public void sendMsg(InMsg inMsg) {
        template.convertAndSendToUser(inMsg.getReceiver(), "/msg",
                new OutMsg(inMsg.getSender(), inMsg.getContent()));
    }

    @MessageMapping("/sendBroadcastMsg")
    @SendTo("/broadcastMsg")
    public OutMsg broadcastMsg(InMsg inMsg) {
        return new OutMsg(inMsg.getSender(), inMsg.getContent());
    }


}
