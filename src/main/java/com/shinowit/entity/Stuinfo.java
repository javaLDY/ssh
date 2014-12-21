package com.shinowit.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2014/12/16.
 */
@Entity
public class Stuinfo {
    private int stuid;
    private String stucode;
    private String stuname;
    private SexCode sexCode;

    @Id
    @Column(name = "stuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    @Basic
    @Column(name="stucode")
    @Size(min = 3,max = 10,message = "{stu.stucode.invalid}")
    public String getStucode() {
        return stucode;
    }

    public void setStucode(String stucode) {
        this.stucode = stucode;
    }

    @Basic
    @Column(name = "stuname")
    @Size(min = 3,max = 10,message = "{stu.stuname.invalid}")
    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    @OneToOne
    @JoinColumn(name = "sexcode")
    @NotNull(message = "性别不能为空")
    public SexCode getSexCode() {
        return sexCode;
    }

    public void setSexCode(SexCode sexCode) {
        this.sexCode = sexCode;
    }
}

