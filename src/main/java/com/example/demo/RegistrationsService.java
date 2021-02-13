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
    public List<RegistrationDto> registrations() {
        List<Registrations> registrations = registrationsRepository.findAll();
        List<RegistrationDto> registrationDto = new ArrayList<>();

        for (Registrations registration : registrations) {
            registrationDto.add(new RegistrationDto(registration));
        }
        return registrationDto;

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
    public List<Registrations> registrationsByDentistId(Integer id) {
        return registrationsRepository.findRegistrationsByDentistId(id);

    }

    @Transactional
    public Registrations registrationById(Integer id) {
        return registrationsRepository.getOne(id);
    }


}
