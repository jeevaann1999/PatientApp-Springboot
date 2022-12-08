package com.nest.patientapp_backend.dao;

import com.nest.patientapp_backend.model.Patients;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patients,Integer> {
    @Query(value="SELECT `id`, `address`, `contact_no`, `dateof_appoint`, `doctor_name`, `patient_name`, `patientid` FROM `patients` WHERE `patientid`LIKE %:patientid%",nativeQuery = true)
    List<Patients> SearchPatients(@Param("patientid") String patientid);
}
