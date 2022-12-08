package com.nest.patientapp_backend.controller;

import com.nest.patientapp_backend.dao.PatientDao;
import com.nest.patientapp_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",produces = "application/json", consumes = "application/json")
    public List<Patients> SearchPatient(@RequestBody Patients p)
    {
        String patientName=p.getPatientName().toString();
        System.out.println(patientName);
        return (List<Patients>) dao.SearchPatients(p.getPatientName());
    }
    @PostMapping(path = "/delete",consumes = "application/json", produces = "application/json")
    public  HashMap<String,String> delete(@RequestBody Patients p)
    {
        String patientid=String.valueOf(p.getPatientid());
        System.out.println(patientid);
        dao.deleteEmployees(p.getPatientName());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return  map;
    }
}
