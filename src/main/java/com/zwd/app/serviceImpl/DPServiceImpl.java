package com.zwd.app.serviceImpl;

import com.zwd.app.domain.DoctorPatient;
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

    @Override
    public List<PatientInfo> selectPatientInfo() {
        PatientExample patientExample = new PatientExample();
        List<Patient> list = patientMapper.selectByExample(patientExample);
        for (Patient patient:list){
            doctorPatientMapper.selectByExample();
            PatientInfo patientInfo = new PatientInfo();
            //patient.;
        }
        return null;
    }

    @Override
    public List<DoctorPatient> quryByPatienId(Long pationid) {
        return doctorPatientMapper.selectResultByPationId(pationid);
    }
}
