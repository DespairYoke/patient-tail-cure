package com.zwd.app.controller;

import com.alibaba.fastjson.JSON;
import com.zwd.app.domain.DoctorPatient;
import com.zwd.app.service.DPService;
import com.zwd.app.entity.DoctorInfo;
import com.zwd.app.entity.PatientInfo;
import com.zwd.app.service.DPService;
import com.zwd.app.service.DoctorService;
import com.zwd.app.util.RespInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/patientinfo")
public class PatientInfoController {

    /***
     * 查询病人信息（PatientInfo）
     */
    @Autowired
    private DPService dpService;
    @Autowired
    private DoctorService doctorService;
    @RequestMapping("selectallpatient")
    public String selectPatientInfo() {
        RespInfo respInfo = new RespInfo();
         List<PatientInfo> list= dpService.selectPatientInfo();
         respInfo.setMsg("查询成功");
         respInfo.setContent(list);
         return JSON.toJSONString(respInfo);
    }
    /***
     * 通过名字具体查询查询病人信息（PatientInfo）
     */
    @RequestMapping("selectpatientbyname")
    public String selectPatientInfoByUserName(String name) {
        RespInfo respInfo = new RespInfo();
        List<PatientInfo> list= dpService.selectPatientInfoByName(name);
        respInfo.setMsg("查询成功");
        respInfo.setContent(list);
        return JSON.toJSONString(respInfo);
    }

    /**
     * 查询病人的病因、治疗方案和主治医生
     * @return
     */
    @RequestMapping("patientanddoctor")
    public String selectDoctorAndPatient(){
        RespInfo respInfo = new RespInfo();
        List<DoctorInfo> list = doctorService.selectResult();
        respInfo.setMsg("查询成功");
        respInfo.setContent(list);
        return JSON.toJSONString(respInfo);

    }

    @RequestMapping("/queryresults")
    public String queryresults(@RequestBody DoctorPatient doctorPatient){
        RespInfo respInfo = new RespInfo();
        List<DoctorPatient> list = dpService.quryByPatienId(doctorPatient.getPatientid());
        if(list.size()==0){
            respInfo.setMsg("你查询的信息不存在!");
            return JSON.toJSONString(respInfo);
        }else{
             respInfo.setContent(list);
             respInfo.setMsg("信息在此:");
             return JSON.toJSONString(list);
        }
    }
}
