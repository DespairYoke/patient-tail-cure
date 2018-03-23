package com.zwd.app.domain;

public class DtPtDrug {
    private Integer id;

    private Integer doctorpatientid;

    private Integer drugid;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorpatientid() {
        return doctorpatientid;
    }

    public void setDoctorpatientid(Integer doctorpatientid) {
        this.doctorpatientid = doctorpatientid;
    }

    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}