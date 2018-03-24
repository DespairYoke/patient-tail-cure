package com.zwd.app.serviceImpl;

import com.zwd.app.domain.Doctor;
import com.zwd.app.domain.DoctorExample;
import com.zwd.app.domain.DoctorPatient;
import com.zwd.app.domain.DoctorPatientExample;
import com.zwd.app.entity.DoctorInfo;
import com.zwd.app.mapper.DoctorMapper;
import com.zwd.app.mapper.DoctorPatientMapper;
import com.zwd.app.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwd
 * @date 2018/3/22 17:03
 * @Email lovejavazwd@gmail.com
 */
@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private DoctorPatientMapper doctorPatientMapper;
    @Override
    public Doctor insertSeletive(Doctor doctor) {
        DoctorExample doctorExample = new DoctorExample();
        doctorExample.createCriteria().andPhoneEqualTo(doctor.getPhone());
        List<Doctor> list = doctorMapper.selectByExample(doctorExample);
        if (list.isEmpty()){
            doctor.setPassword("123456");
            doctorMapper.insertSelective(doctor);
            return doctor;
        }
        return list.get(0);
    }

    @Override
    public Doctor selectByPhoneAndPassword(Doctor doctor) {
        DoctorExample doctorExample = new DoctorExample();
        doctorExample.createCriteria().andPhoneEqualTo(doctor.getPhone()).andPasswordEqualTo(doctor.getPassword());
        List<Doctor> list = doctorMapper.selectByExample(doctorExample);
        if (list.isEmpty()) {
            return null;
        }else
        {
            return list.get(0);
        }
    }
    //查询所有骨科的普通医生
    @Override
    public List<Doctor> queryAllBoneNomalDoctor() {
        DoctorExample example = new DoctorExample();
        example.createCriteria().andDepartmentEqualTo((byte)1).andPositionEqualTo((byte)1);
        List<Doctor> doctors = doctorMapper.selectByExample(example);
        return doctors;
    }

    //查询所有骨科的专家医生
    @Override
    public List<Doctor> queryAllBonePrefessionalDoctor() {
        DoctorExample doctorExample = new DoctorExample();
        doctorExample.createCriteria().andDepartmentEqualTo((byte)1).andPositionEqualTo((byte)2);
        List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
        return doctors;
    }

    //查询所有牙科的普通医生
    @Override
    public List<Doctor> queryAllToothNomalDoctor() {
        DoctorExample doctorExample = new DoctorExample();
        doctorExample.createCriteria().andDepartmentEqualTo((byte)2).andPositionEqualTo((byte)1);
        List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
        return doctors;
    }

    //查询所有牙科的专家医生
    @Override
    public List<Doctor> queryAllToothPrefessionalDoctor() {
        DoctorExample doctorExample = new DoctorExample();
        doctorExample.createCriteria().andDepartmentEqualTo((byte)2).andPositionEqualTo((byte)2);
        List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
        return doctors;
    }

    @Override
    public List<DoctorInfo> selectResult() {
        List<DoctorInfo> list1 = new ArrayList<>();
        DoctorPatientExample doctorPatientExample = new DoctorPatientExample();
        List<DoctorPatient> list = doctorPatientMapper.selectByExample(doctorPatientExample);
        for (DoctorPatient doctorPatient:list) {
            Doctor doctor= doctorMapper.selectByPrimaryKey(doctorPatient.getDoctorid());
            DoctorInfo doctorInfo = new DoctorInfo();
            doctorInfo.setName(doctor.getName());
            doctorInfo.setDepartment(doctor.getDepartment());
            doctorInfo.setPathogeny(doctorPatient.getPathogeny());
            doctorInfo.setPhone(doctor.getPhone());
            doctorInfo.setResult(doctorPatient.getResult());
            list1.add(doctorInfo);
        }
        return list1;
    }
}
