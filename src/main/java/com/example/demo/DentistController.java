package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("dentist")
@RestController

public class DentistController {

    private final DentistService dentistService;
    private final RegistrationsService registrationsService;

    public DentistController(DentistService dentistService, RegistrationsService registrationsService) {
        this.dentistService = dentistService;
        this.registrationsService = registrationsService;
    }

    @GetMapping("dentist-list")
    public List<Dentist> dentists() {
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
    public List<Registrations> registrationsByDentistId(@PathVariable("id") Integer id) {
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

}
