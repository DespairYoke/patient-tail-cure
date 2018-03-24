package com.zwd.app.service;

import com.zwd.app.domain.DoctorPatient;
import com.zwd.app.entity.PatientInfo;

import java.util.List;

/**
 * @author zwd
 * @date 2018/3/22 17:21
 * @Email lovejavazwd@gmail.com
 */
public interface DPService {
    void insertSelective(DoctorPatient doctorPatient);

    List<PatientInfo> selectPatientInfo();

    List<DoctorPatient> quryByPatienId(Integer pationid);

    List<PatientInfo> selectPatientInfoByName(String name);
}
