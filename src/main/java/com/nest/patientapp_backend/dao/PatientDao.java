package com.nest.patientapp_backend.dao;

import com.nest.patientapp_backend.model.Patients;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patients,Integer> {
    @Query(value="SELECT `id`, `address`, `contact_no`, `dateof_appoint`, `doctor_name`, `patient_name`, `patientid` FROM `patients` WHERE `patient_name`LIKE %:patientName%",nativeQuery = true)
    List<Patients> SearchPatients(@Param("patientName") String patientName);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patients` WHERE `patient_name`=:patientName",nativeQuery = true)
    void deleteEmployees(@Param("patientName") String patientName);


}
