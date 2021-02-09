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

    @GetMapping("dentist-name/{id}")
    public String getDentistName(@PathVariable("id") Integer id) {
        return dentistService.getDentistName(id);
    }

    @GetMapping("dentist-list")
    public List<Dentist> dentists() {
        return dentistService.dentists();

    }

    @GetMapping("registrations")
    public List<Registrations> registrations() {
        return registrationsService.registrations();

    }

    @GetMapping("registrations-by-dentist-id/{id}")
    public List<Registrations> registrationsByDentistId(@PathVariable("id") Integer id) {
        return registrationsService.registrationsByDentistId(id);
    }

    @PostMapping("add-registration")
    public void addRegistration(@RequestBody Registrations registrations) {
        registrationsService.addRegistration(registrations);
    }

    @DeleteMapping("delete-registration")
    public void deleteRegistration(@RequestBody Registrations registrations) {
        registrationsService.deleteRegistration(registrations);
    }


}
