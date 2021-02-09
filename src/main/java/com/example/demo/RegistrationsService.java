package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationsService {

    @Autowired
    private RegistrationsRepository registrationsRepository;

    @Transactional
    public List<Registrations> registrations() {
        List<Registrations> registrations = registrationsRepository.findAll();
        return registrations;
    }

    @Transactional
    public List<Registrations> registrationsByDentistId(Integer id) {
        List<Registrations> registrations = registrationsRepository.findRegistrationsByDentistId(id);
        return registrations;
    }

    public void addRegistration(Registrations registrations) {
        Registrations entity = new Registrations();
        entity.setDate(registrations.getDate());
        entity.setTime(registrations.getTime());
        entity.setCustomersName(registrations.getCustomersName());
        entity.setCustomersIdCardNr(registrations.getCustomersIdCardNr());
        entity.setDentistId(registrations.getDentistId());
        registrationsRepository.save(entity);
    }

    public void deleteRegistration(Registrations registrations) {
        Registrations entity = new Registrations();
        entity.setId(registrations.getId());
        registrationsRepository.delete(entity);
    }


}
