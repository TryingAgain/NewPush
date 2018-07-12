package com.example.firstProjectRest;

import com.example.firstProjectModel.PatientDetails;
import org.springframework.stereotype.Service;
import com.example.firstProjectModel.PatientDetails;

import java.util.*;

/**
 * Created by prabhu-92 on 12/7/18.
 */
@Service
public class PatientServiceImplementation implements PatientService {

    Map<Long, PatientDetails> patients = new HashMap<>();
    long currentId = 123;

    public PatientServiceImplementation(){

        init();
    }

    void init(){

        PatientDetails patient = new PatientDetails();
        patient.setId(currentId);
        patient.setName("John");
        patients.put(patient.getId(), patient);
        System.out.println("test1");
    }

    public List<PatientDetails> getPatients() {

        Collection<PatientDetails> results = patients.values();
        List<PatientDetails> response = new ArrayList<>(results);
        System.out.println("test2");

        return response;
    }

    public PatientDetails getPatients(Long id){

        return patients.get(id);
    }

}
