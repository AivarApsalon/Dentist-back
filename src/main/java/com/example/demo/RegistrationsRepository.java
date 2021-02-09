package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationsRepository extends JpaRepository<Registrations, Integer> {
     List<Registrations> findRegistrationsByDentistId(Integer id);
}
