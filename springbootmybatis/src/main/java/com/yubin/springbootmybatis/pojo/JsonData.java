package com.yubin.springbootmybatis.pojo;

import java.io.Serializable;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-20 14:19
 **/
public class JsonData implements Serializable {

    private String status;

    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public JsonData() {
    }

    public JsonData(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
