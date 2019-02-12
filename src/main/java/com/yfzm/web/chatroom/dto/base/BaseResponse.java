package com.yfzm.web.chatroom.dto.base;

public class BaseResponse {
    private Boolean status;

    public BaseResponse() {
    }

    public BaseResponse(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
