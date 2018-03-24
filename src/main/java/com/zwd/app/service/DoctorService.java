package com.zwd.app.service;

import com.zwd.app.domain.Doctor;
<<<<<<< HEAD
=======
import com.zwd.app.entity.DoctorInfo;
>>>>>>> ca409ffc8d5d03a481fe91a3b76be095dd6a00bf

import java.util.List;

/**
 * @author zwd
 * @date 2018/3/22 17:03
 * @Email lovejavazwd@gmail.com
 */
public interface DoctorService {
    void insertSeletive(Doctor doctor);

    Doctor selectByPhoneAndPassword(Doctor doctor);

<<<<<<< HEAD

    List<Doctor> queryAllBoneNomalDoctor(Doctor doctor);
=======
    List<DoctorInfo> selectResult();
>>>>>>> ca409ffc8d5d03a481fe91a3b76be095dd6a00bf
}
