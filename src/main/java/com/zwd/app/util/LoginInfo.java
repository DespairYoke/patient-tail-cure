package com.zwd.app.util;

/**
 * @author zwd
 * @date 2018/3/23 14:54
 * @Email lovejavazwd@gmail.com
 */
public class LoginInfo {

    private String phone;
    //0病人 1医生
    private Byte status;

    private String password;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
