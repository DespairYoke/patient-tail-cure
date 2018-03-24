package com.zwd.app.service;

import com.zwd.app.domain.Doctor;

import com.zwd.app.entity.DoctorInfo;


import java.util.List;

/**
 * @author zwd
 * @date 2018/3/22 17:03
 * @Email lovejavazwd@gmail.com
 */
public interface DoctorService {
    Doctor insertSeletive(Doctor doctor);

    Doctor selectByPhoneAndPassword(Doctor doctor);


    List<Doctor> queryAllBoneNomalDoctor();

    List<Doctor> queryAllBonePrefessionalDoctor();

    List<Doctor> queryAllToothNomalDoctor();

    List<Doctor> queryAllToothPrefessionalDoctor();

    List<DoctorInfo> selectResult();

    int updateUser(Doctor doctor);

    Doctor selectDoctor(Doctor doctor);
}
