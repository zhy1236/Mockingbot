package com.example.hand.mockingbot.entity;

import java.util.List;

/**
 * Created by zhy on 2017/5/20.
 */

public class Entity {

    private String msg;
    private String code;
    private List<?> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
