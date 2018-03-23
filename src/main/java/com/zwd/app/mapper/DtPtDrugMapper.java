package com.zwd.app.mapper;

import com.zwd.app.domain.DtPtDrug;
import com.zwd.app.domain.DtPtDrugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtPtDrugMapper {
    long countByExample(DtPtDrugExample example);

    int deleteByExample(DtPtDrugExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DtPtDrug record);

    int insertSelective(DtPtDrug record);

    List<DtPtDrug> selectByExample(DtPtDrugExample example);

    DtPtDrug selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DtPtDrug record, @Param("example") DtPtDrugExample example);

    int updateByExample(@Param("record") DtPtDrug record, @Param("example") DtPtDrugExample example);

    int updateByPrimaryKeySelective(DtPtDrug record);

    int updateByPrimaryKey(DtPtDrug record);
}