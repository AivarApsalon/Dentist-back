package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DentistService {

    @Autowired

    private DentistRepository dentistRepository;


    public String getDentistName(Integer id) {
        Dentist dentistList = dentistRepository.getOne(id);
        return dentistList.getDentistName();
    }

    @Transactional
    public List<Dentist> dentists() {
        List<Dentist> dentists = dentistRepository.findAll();
        return dentists;
    }


}




