package com.zwd.app.service;

import com.zwd.app.domain.Patient; /**
 * @author zwd
 * @date 2018/3/22 16:26
 * @Email lovejavazwd@gmail.com
 */
public interface UserService {
    Patient insertSeletive(Patient patient);

    Patient selectByPhoneAndPassword(Patient patient);

    int updateUser(Patient patient);
}
