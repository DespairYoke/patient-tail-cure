package com.zwd.app.controller;

import com.alibaba.fastjson.JSON;
import com.zwd.app.domain.Drug;
import com.zwd.app.service.DrugService;
import com.zwd.app.util.RespInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "drug")
public class DrugController {

    @Autowired
    private DrugService drugService;
    @RequestMapping("selectdrug")
    public String selectDrug() {
        RespInfo respInfo = new RespInfo();
        List<Drug> list = drugService.selectDrug();
        respInfo.setContent(list);
        respInfo.setMsg("查询成功");
        return JSON.toJSONString(respInfo);
    }
}
