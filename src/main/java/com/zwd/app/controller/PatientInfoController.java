package com.zwd.app.controller;

import com.alibaba.fastjson.JSON;
import com.zwd.app.domain.DoctorPatient;
import com.zwd.app.service.DPService;
import com.zwd.app.util.RespInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zwd
 * @date 2018/3/23 15:08
 * @Email lovejavazwd@gmail.com
 */
@RestController
@RequestMapping(value = "/patientinfo")
public class PatientInfoController {

    @Autowired
    private DPService dpService;
    @RequestMapping("selectallpatient")
    public String selectPatientInfo() {
        dpService.selectPatientInfo();
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
