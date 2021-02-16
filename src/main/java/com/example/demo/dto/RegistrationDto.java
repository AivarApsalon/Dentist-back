package com.example.demo.dto;

import com.example.demo.Registrations;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegistrationDto {
    private Integer id;
    private LocalDate date;
    private LocalTime time;
    private String firstName;
    private String lastName;
    private String idCardNr;
    private Integer dentistId;
    private String dentistName;

    public RegistrationDto(Registrations registration) {
        this.id = registration.getId();
        this.date = registration.getDate();
        this.time = registration.getTime();
        this.firstName = registration.getFirstName();
        this.lastName = registration.getLastName();
        this.idCardNr = registration.getIdCardNr();
        this.dentistId = registration.getDentist().getId();
        this.dentistName = registration.getDentist().getDentistName();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdCardNr() {
        return idCardNr;
    }

    public void setIdCardNr(String idCardNr) {
        this.idCardNr = idCardNr;
    }

    public Integer getDentistId() {
        return dentistId;
    }

    public void setDentistId(Integer dentistId) {
        this.dentistId = dentistId;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

}


