package com.wyc.web.persistence.model;/**
 * Created by wyc on 2017/01/15.
 */

import com.fasterxml.jackson.databind.deser.Deserializers;

/**
 * @author wangyongcan
 * @Date 2017/01/15 16:41
 */
public class User extends BaseEntity {
    private String username;
    private int age;
    private String title;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
