package com.example.ktws.vo;

import com.example.ktws.domain.User;

public class UserInfo {
    private String name;

    private Integer coursenum;

    private String email;

    private String phone;

    public UserInfo() {}

    public UserInfo(User user) {
        this.name = user.getName();
        this.coursenum = user.getCourses().size();
        this.email = user.getEmail();
        this.phone = user.getPhone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(Integer coursenum) {
        this.coursenum = coursenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
