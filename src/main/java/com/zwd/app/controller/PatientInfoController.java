package com.zwd.app.controller;

import com.zwd.app.service.DPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
