package com.example.firstProjectRest;
import com.example.firstProjectModel.PatientDetails;

import com.example.firstProjectModel.PatientDetails;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by prabhu-92 on 12/7/18.
 */
@Path("/patientservice")
@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
public interface PatientService {

    @Path("/patients")
    @GET
    List<PatientDetails> getPatients();

    @Path("/patients/{id}")
    @GET
    PatientDetails getPatients(@PathParam(value ="id") Long id);
}
