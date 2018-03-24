package com.zwd.app.entity;

/**
 * @author zwd
 * @date 2018/3/23 16:28
 * @Email lovejavazwd@gmail.com
 */
public class DoctorInfo {

    private Byte position;

    private Byte department;

    private String name;

    private String phone;

    private String pathogeny;

    private String result;


    public Byte getDepartment() {
        return department;
    }

    public void setDepartment(Byte department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Byte getPosition() {
        return position;
    }

    public void setPosition(Byte position) {
        this.position = position;
    }

    public String getPathogeny() {
        return pathogeny;
    }

    public void setPathogeny(String pathogeny) {
        this.pathogeny = pathogeny;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
