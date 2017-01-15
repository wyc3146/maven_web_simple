package com.wyc.web.persistence.model;/**
 * Created by wyc on 2017/01/15.
 */

import java.util.Date;

/**
 * 实体类的基类，每个mysql的实体类都要继承自它
 * @author wangyongcan
 * @Date 2017/01/15 16:43
 */
public abstract class BaseEntity {
    private int id;
    private Date createdAt;
    private Date updatedAt;
    private String creator;
    private String modifier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}
