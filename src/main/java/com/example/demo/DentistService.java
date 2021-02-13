package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DentistService {

    @Autowired
    private DentistRepository dentistRepository;


    public Dentist getDentist(Integer id) {
        Dentist dentist = dentistRepository.getOne(id);
        return dentist;
    }

    @Transactional
    public List<Dentist> dentists() {
        List<Dentist> dentists = dentistRepository.findAll();
        return dentists;
    }


}




