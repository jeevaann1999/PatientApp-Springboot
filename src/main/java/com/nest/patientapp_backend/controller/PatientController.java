package com.nest.patientapp_backend.controller;

import com.nest.patientapp_backend.dao.PatientDao;
import com.nest.patientapp_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json", produces = "application/json")
    public String AddPatient(@RequestBody Patients p){
        System.out.println(p.getPatientName().toString());
        System.out.println(p.getPatientid().toString());
        System.out.println(p.getAddress().toString());
        System.out.println(p.getContactNo().toString());
        System.out.println(p.getDateofAppoint().toString());
        System.out.println(p.getDoctorName().toString());
        dao.save(p);
        return "Patient Added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patients> ViewPatient(){
        return (List<Patients>) dao.findAll();
    }
}
