package com.zwd.app.serviceImpl;

import com.zwd.app.domain.DtPtDrug;
import com.zwd.app.mapper.DtPtDrugMapper;
import com.zwd.app.service.DPDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zwd
 * @date 2018/3/22 17:22
 * @Email lovejavazwd@gmail.com
 */
@Service
@Transactional
public class DPDServiceImpl implements DPDService {
    @Autowired
    private DtPtDrugMapper dtPtDrugMapper;
    @Override
    public void insertSelective(DtPtDrug dtPtDrug) {
        dtPtDrugMapper.insertSelective(dtPtDrug);
    }
}
