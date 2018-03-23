package com.zwd.app.serviceImpl;

import com.zwd.app.domain.Patient;
import com.zwd.app.domain.PatientExample;
import com.zwd.app.mapper.PatientMapper;
import com.zwd.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * @author zwd
 * @date 2018/3/22 16:26
 * @Email lovejavazwd@gmail.com
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private PatientMapper patientMapper;
    @Override
    public void insertSeletive(Patient patient) {
        patientMapper.insertSelective(patient);
    }

    @Override
    public Patient selectByPhoneAndPassword(Patient patient) {
        PatientExample patientExample = new PatientExample();
        patientExample.createCriteria().andPhoneEqualTo(patient.getPhone()).andPasswordEqualTo(patient.getPassword());
        List<Patient> list = patientMapper.selectByExample(patientExample);
        if (list.isEmpty()) {
            return null;
        }else {
            return list.get(0);
        }

    }
}
