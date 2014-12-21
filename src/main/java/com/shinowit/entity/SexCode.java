package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/12/19.
 */
@Entity
@Table(name = "sexcode")
public class SexCode {

    @Id
    @Column(name = "sexcode",length = 10)
    private String SexCode;

    @Basic
    @Column(name = "sexname",length = 50)
    private String SexName;

    public String getSexCode() {
        return SexCode;
    }

    public void setSexCode(String sexCode) {
        SexCode = sexCode;
    }

    public String getSexName() {
        return SexName;
    }

    public void setSexName(String sexName) {
        SexName = sexName;
    }
}
