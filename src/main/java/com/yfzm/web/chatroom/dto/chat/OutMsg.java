package com.yfzm.web.chatroom.dto.chat;

public class OutMsg {
    private String sender;
    private String content;

    public OutMsg() {
    }

    public OutMsg(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
