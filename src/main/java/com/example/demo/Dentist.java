package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String dentistName;

    @OneToMany(mappedBy = "dentist")
    private List <Registrations> registrations;


    public List<Registrations> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registrations> registrations) {
        this.registrations = registrations;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
