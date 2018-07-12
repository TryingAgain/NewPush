package com.example.firstProjectModel;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by prabhu-92 on 12/7/18.
 */
@XmlRootElement(name = "patientdetails")
public class PatientDetails {

    // variable section
    private long id;
    private String name;

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
