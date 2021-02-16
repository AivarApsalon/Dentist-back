package com.example.demo.service;

import com.example.demo.Dentist;
import com.example.demo.Registrations;
import com.example.demo.dto.AddRegistrationRequest;
import com.example.demo.dto.RegistrationDto;
import com.example.demo.dto.RegistrationsByDentistId;
import com.example.demo.repository.DentistRepository;
import com.example.demo.repository.RegistrationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationsService {

    @Autowired
    private RegistrationsRepository registrationsRepository;

    @Autowired
    private DentistRepository dentistRepository;

    @Transactional
    public List<RegistrationDto> registrations() {
        List<Registrations> registrations = registrationsRepository.findAll();
        List<RegistrationDto> registrationDto = new ArrayList<>();
        for (Registrations registration : registrations) {
            registrationDto.add(new RegistrationDto(registration));
        }
        return registrationDto;
    }

    @Transactional
    public List<RegistrationsByDentistId> registrationsByDentistId(Integer id) {
        List<Registrations> registrations = registrationsRepository.findRegistrationsByDentistId(id);
        List<RegistrationsByDentistId> registrationsByDentistId = new ArrayList<>();
        for (Registrations registration : registrations) {
            registrationsByDentistId.add(new RegistrationsByDentistId(registration));
        }
        return registrationsByDentistId;
    }



    public void addRegistration(AddRegistrationRequest request) {
        Registrations registrations = new Registrations();
        registrations.setIdCardNr(request.getIdCardNr());
        registrations.setLastName(request.getLastName());
        registrations.setFirstName(request.getFirstName());
        registrations.setTime(request.getTime());
        registrations.setDate(request.getDate());
        Dentist dentist = dentistRepository.getOne(request.getDentistId());
        registrations.setDentist(dentist);
        registrationsRepository.save(registrations);
    }

    public void deleteRegistration(Integer id) {
        Registrations entity = new Registrations();
        entity.setId(id);
        registrationsRepository.delete(entity);
    }

    @Transactional
    public Registrations registrationById(Integer id) {
        return registrationsRepository.getOne(id);
    }

    @Transactional
    public void changeRegistration(Integer id, AddRegistrationRequest request) {
        Registrations registrations = new Registrations();
        registrations.setId(id);
        registrations.setIdCardNr(request.getIdCardNr());
        registrations.setLastName(request.getLastName());
        registrations.setFirstName(request.getFirstName());
        registrations.setTime(request.getTime());
        registrations.setDate(request.getDate());
        Dentist dentist = dentistRepository.getOne(request.getDentistId());
        registrations.setDentist(dentist);
        registrationsRepository.save(registrations);

    }

}
