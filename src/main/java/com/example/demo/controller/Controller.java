package com.example.demo.controller;

import com.example.demo.*;
import com.example.demo.dto.AddRegistrationRequest;
import com.example.demo.dto.DentistDto;
import com.example.demo.dto.RegistrationDto;
import com.example.demo.dto.RegistrationsByDentistId;
import com.example.demo.service.DentistService;
import com.example.demo.service.RegistrationsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("dentist")
@RestController

public class Controller {

    private final DentistService dentistService;
    private final RegistrationsService registrationsService;

    public Controller(DentistService dentistService, RegistrationsService registrationsService) {
        this.dentistService = dentistService;
        this.registrationsService = registrationsService;
    }

    @GetMapping("dentist-list")
    public List<DentistDto> dentists() {
        return dentistService.dentists();
    }

    @GetMapping("registrations")
    public List<RegistrationDto> registrations() {
        return registrationsService.registrations();
    }

    @GetMapping("registration-by-id/{id}")
    public RegistrationDto registrationById(@PathVariable("id") Integer id) {
        return new RegistrationDto(registrationsService.registrationById(id));
    }

    @GetMapping("registrations-by-dentist-id/{id}")
    public List<RegistrationsByDentistId> registrationsByDentistId(@PathVariable("id") Integer id) {
        return registrationsService.registrationsByDentistId(id);
    }

    @PostMapping("add-registration")
    public void addRegistration(@RequestBody AddRegistrationRequest registration) {
        registrationsService.addRegistration(registration);
    }

    @DeleteMapping("delete-registration/{id}")
    public void deleteRegistration(@PathVariable("id") Integer id) {
        registrationsService.deleteRegistration(id);
    }

    @PutMapping("change-registration/{id}")
    public void changeRegistration(@PathVariable("id") Integer id, @RequestBody AddRegistrationRequest registration) {
        registrationsService.changeRegistration(id, registration);
    }


}
