package com.zwd.app.mapper;

import com.zwd.app.domain.DoctorPatient;
import com.zwd.app.domain.DoctorPatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorPatientMapper {
    long countByExample(DoctorPatientExample example);

    int deleteByExample(DoctorPatientExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoctorPatient record);

    int insertSelective(DoctorPatient record);

    List<DoctorPatient> selectByExample(DoctorPatientExample example);

    DoctorPatient selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoctorPatient record, @Param("example") DoctorPatientExample example);

    int updateByExample(@Param("record") DoctorPatient record, @Param("example") DoctorPatientExample example);

    int updateByPrimaryKeySelective(DoctorPatient record);

    int updateByPrimaryKey(DoctorPatient record);

    List<DoctorPatient> selectResultByPationId(Long pationid);
}