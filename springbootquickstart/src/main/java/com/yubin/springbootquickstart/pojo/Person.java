package com.yubin.springbootquickstart.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-19 09:37
 **/
public class Person implements Serializable {
    /**
     * @JsonProperty(access=Access.WRITE_ONLY)
     * @NotNull(message="id is not null")
     */
    @JsonProperty(value = "uuid")
    @NotNull(message = "it's must not null")
    private String id;

    private String name;
    private String age;
    @JsonIgnore
    private String phone;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    public Person() {
    }

    public Person( String id, String name, String age, String phone, Date createDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
