package com.zwd.app.serviceImpl;

import com.zwd.app.domain.Drug;
import com.zwd.app.mapper.DrugMapper;
import com.zwd.app.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zwd
 * @date 2018/3/22 17:08
 * @Email lovejavazwd@gmail.com
 */
@Service
@Transactional
public class DrugServiceImpl implements DrugService{

    @Autowired
    private DrugMapper drugMapper;
    @Override
    public void insertSeletive(Drug drug) {
        drugMapper.insertSelective(drug);
    }
}
