package com.zwd.app.serviceImpl;

import com.zwd.app.domain.DoctorPatient;
import com.zwd.app.domain.DoctorPatientExample;
import com.zwd.app.domain.Patient;
import com.zwd.app.domain.PatientExample;
import com.zwd.app.entity.PatientInfo;
import com.zwd.app.mapper.DoctorMapper;
import com.zwd.app.mapper.DoctorPatientMapper;
import com.zwd.app.mapper.PatientMapper;
import com.zwd.app.service.DPService;
import com.zwd.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwd
 * @date 2018/3/22 17:21
 * @Email lovejavazwd@gmail.com
 */
@Service
@Transactional
public class DPServiceImpl implements DPService{

    @Autowired
    private DoctorPatientMapper doctorPatientMapper;
    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Override
    public void insertSelective(DoctorPatient doctorPatient) {
        doctorPatientMapper.insertSelective(doctorPatient);
    }

    /**
     * 查询病人信息（PatientInfo）
     * @return
     */
    @Override
    public List<PatientInfo> selectPatientInfo() {
        PatientExample patientExample = new PatientExample();
        List<Patient> list = patientMapper.selectByExample(patientExample);
        List<PatientInfo> patientInfoList = new ArrayList<>();
        for (Patient patient:list){
            DoctorPatientExample doctorPatientExample = new DoctorPatientExample();
            doctorPatientExample.createCriteria().andPatientidEqualTo(patient.getId());
            List<DoctorPatient> list1 = doctorPatientMapper.selectByExample(doctorPatientExample);
            for (DoctorPatient doctorPatient : list1) {
                PatientInfo patientInfo = new PatientInfo();
                patientInfo.setName(patient.getName());
                patientInfo.setPhone(patient.getPhone());
                patientInfo.setAge(patient.getAge());
                patientInfo.setSex(patient.getSex());
                patientInfo.setPathogeny(doctorPatient.getPathogeny());
                patientInfo.setResult(doctorPatient.getResult());
                patientInfo.setDate(doctorPatient.getTime());
                patientInfoList.add(patientInfo);
            }

        }
        return patientInfoList;
    }

    @Override
    public List<PatientInfo> selectPatientInfoByName(String name) {
        List<PatientInfo> patientInfoList = new ArrayList<>();
        PatientExample patientExample = new PatientExample();
        patientExample.createCriteria().andNameEqualTo(name);
        Patient patient = patientMapper.selectByExample(patientExample).get(0);
        DoctorPatientExample doctorPatientExample = new DoctorPatientExample();
        doctorPatientExample.createCriteria().andPatientidEqualTo(patient.getId());
        List<DoctorPatient> list1 = doctorPatientMapper.selectByExample(doctorPatientExample);
        for (DoctorPatient doctorPatient : list1) {
            PatientInfo patientInfo = new PatientInfo();
            patientInfo.setName(patient.getName());
            patientInfo.setPhone(patient.getPhone());
            patientInfo.setAge(patient.getAge());
            patientInfo.setSex(patient.getSex());
            patientInfo.setPathogeny(doctorPatient.getPathogeny());
            patientInfo.setResult(doctorPatient.getResult());
            patientInfoList.add(patientInfo);
        }
        return patientInfoList;
    }
}
