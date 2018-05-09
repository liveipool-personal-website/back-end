package org.liveipool;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by liveipool on 2018/5/9.
 */
@Entity
@Table(name="personal_info")
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class PersonalInfo {
    @Id
    @Column(name = "wechat")
    private String wechat;
    @Column(name = "email")
    private String email;
    @Column(name = "github")
    private String github;

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

}
