package com.zwd.app.controller;


import com.alibaba.fastjson.JSON;
import com.zwd.app.domain.Doctor;
import com.zwd.app.domain.Patient;
import com.zwd.app.service.DoctorService;
import com.zwd.app.service.UserService;
import com.zwd.app.util.RespInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "login")
public class LoginController {

    @Autowired
    private DoctorService doctorService;
    @Autowired
    private UserService userService;
    @RequestMapping(value = "user")
    public String login( Doctor doctor) {
        RespInfo respInfo = new RespInfo();
        Doctor doctor1 = doctorService.selectByPhoneAndPassword(doctor);
        if (doctor1!=null) {
            respInfo.setMsg("0表示病人 1表示医生");
            respInfo.setContent(1);
            return JSON.toJSONString(respInfo);
        }else {
            Patient patient = new Patient();
            patient.setPhone(doctor.getPhone());
            patient.setPassword(doctor.getPassword());
            if (userService.selectByPhoneAndPassword(patient)!=null)
            {
                respInfo.setMsg("0表示病人 1表示医生");
                respInfo.setContent(0);
                return JSON.toJSONString(respInfo);
            }
            respInfo.setMsg("改用户不存在");
            return JSON.toJSONString(respInfo);
        }
    }
}
