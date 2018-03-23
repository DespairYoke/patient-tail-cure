package com.zwd.app.util;

import com.zwd.app.domain.Doctor;
import com.zwd.app.domain.Drug;
import com.zwd.app.domain.Patient;

/**
 * @author zwd
 * @date 2018/3/22 16:59
 * @Email lovejavazwd@gmail.com
 */
public class AddPtDcInfo {

    private Integer number;

    private Patient patient;

    private Doctor doctor;

    private Drug drug;

    private String pathogeny;

    public String getPathogeny() {
        return pathogeny;
    }

    public void setPathogeny(String pathogeny) {
        this.pathogeny = pathogeny;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
}
