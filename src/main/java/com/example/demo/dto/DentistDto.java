package com.example.demo.dto;

import com.example.demo.Dentist;

public class DentistDto {
    private Integer id;
    private String dentistName;

    public DentistDto(Dentist dentist) {
        this.id = dentist.getId();
        this.dentistName = dentist.getDentistName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }
}
