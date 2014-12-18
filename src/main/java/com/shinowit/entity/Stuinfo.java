package com.shinowit.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2014/12/16.
 */
@Entity
public class Stuinfo {
    private int stuid;
    private int stucode;
    private String stuname;
    private boolean success;
    private String message;

    @Id
    @Column(name = "stuid")
    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    @Basic
    @Column(name = "stuname")
    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getStucode() {
        return stucode;
    }

    public void setStucode(int stucode) {
        this.stucode = stucode;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
