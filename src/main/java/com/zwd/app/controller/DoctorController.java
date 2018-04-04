package com.zwd.app.controller;

import com.alibaba.fastjson.JSON;
import com.zwd.app.domain.Doctor;
import com.zwd.app.domain.Patient;
import com.zwd.app.service.DoctorService;
import com.zwd.app.util.RespInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    //骨科普通医生
    @RequestMapping("/querybonenomal")
    public String querybonenomal(){
        RespInfo respInfo = new RespInfo();
        List<Doctor> doctors = doctorService.queryAllBoneNomalDoctor();
        if(doctors.size()==0){
            respInfo.setMsg("查询的骨科普通医生不存在!");
        }else{
            respInfo.setMsg("骨科普通医生在此:");
            respInfo.setContent(doctors);
        }
        return JSON.toJSONString(doctors);
    }

    //骨科专家
    @RequestMapping("/queryboneprefessional")
    public String queryboneprefessional(){
        RespInfo respInfo = new RespInfo();
        List<Doctor> doctors = doctorService.queryAllBonePrefessionalDoctor();
        if(doctors.size()==0){
            respInfo.setMsg("查询的骨科专家不存在!");
        }else{
            respInfo.setMsg("骨科专家医生在此:");
            respInfo.setContent(doctors);
        }
        return JSON.toJSONString(doctors);
    }

    //牙科普通医生

    @RequestMapping("/querytoothnomal")
    public String querytoothnomal(){
        RespInfo respInfo = new RespInfo();
        List<Doctor> doctors = doctorService.queryAllToothNomalDoctor();
        if(doctors.size()==0){
            respInfo.setMsg("查询的牙科普通医生不存在!");
        }else{
            respInfo.setMsg("牙科普通医生在此:");
            respInfo.setContent(doctors);
        }
        return JSON.toJSONString(doctors);
    }

    //牙科专家医生

    @RequestMapping("/querytoothprefessional")
    public String querytoothprefessional(){
        RespInfo respInfo = new RespInfo();
        List<Doctor> doctors = doctorService.queryAllToothPrefessionalDoctor();
        if(doctors.size()==0){
            respInfo.setMsg("查询的牙科专家不存在!");
        }else{
            respInfo.setMsg("牙科专家在此:");
            respInfo.setContent(doctors);
        }
        return JSON.toJSONString(doctors);
    }
    @RequestMapping("selectdoctor")
    public String selectdoctor( Doctor doctor){
        RespInfo info = new RespInfo();
        info.setContent(doctorService.selectDoctor(doctor));
        info.setMsg("查询成功");
        return JSON.toJSONString(info);
    }
    @RequestMapping("modifydoctor")
    public String modifyDoctor(Doctor doctor){
        RespInfo info = new RespInfo();
        int num = doctorService.updateUser(doctor);
        if(num<0){
            info.setMsg("信息修改失败!");
        }else{
            info.setMsg("信息修改成功!");
        }
        return JSON.toJSONString(info);
    }
}
