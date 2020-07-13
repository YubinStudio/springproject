package com.yubin.springbootmybatisbyanotation.pojo;

import java.io.Serializable;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-20 14:19
 **/
public class JsonData implements Serializable {

    private String status;
    private String msg;
    private Object data;

    public JsonData() {
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public JsonData(String status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}
