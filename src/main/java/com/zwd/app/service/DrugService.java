package com.zwd.app.service;

import com.zwd.app.domain.Drug;

import java.util.List;

/**
 * @author zwd
 * @date 2018/3/22 17:08
 * @Email lovejavazwd@gmail.com
 */
public interface DrugService {
    void insertSeletive(Drug drug);

    List<Drug> selectDrug();
}
