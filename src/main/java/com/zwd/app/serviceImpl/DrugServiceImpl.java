package com.zwd.app.serviceImpl;

import com.zwd.app.domain.Drug;
import com.zwd.app.domain.DrugExample;
import com.zwd.app.mapper.DrugMapper;
import com.zwd.app.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public Drug insertSeletive(Drug drug) {
        DrugExample drugExample = new DrugExample();
        drugExample.createCriteria().andNameEqualTo(drug.getName());
        List<Drug> list = drugMapper.selectByExample(drugExample);
        if (list.isEmpty()) {
            drugMapper.insertSelective(drug);
            return drug;
        }
        return list.get(0);
    }

    @Override
    public List<Drug> selectDrug() {
        DrugExample drugExample = new DrugExample();
        return drugMapper.selectByExample(drugExample);
    }
}
