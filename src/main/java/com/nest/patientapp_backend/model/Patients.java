package com.nest.patientapp_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patients {

    @Id
    @GeneratedValue
    private int id;
    private String patientName;
    private String patientid;
    private String address;
    private String contactNo;
    private String dateofAppoint;
    private String doctorName;

    public Patients() {
    }

    public Patients(int id, String patientName, String patientid, String address, String contactNo, String dateofAppoint, String doctorName) {
        this.id = id;
        this.patientName = patientName;
        this.patientid = patientid;
        this.address = address;
        this.contactNo = contactNo;
        this.dateofAppoint = dateofAppoint;
        this.doctorName = doctorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getDateofAppoint() {
        return dateofAppoint;
    }

    public void setDateofAppoint(String dateofAppoint) {
        this.dateofAppoint = dateofAppoint;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}


