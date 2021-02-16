package com.example.demo.repository;

import com.example.demo.Registrations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

public interface RegistrationsRepository extends JpaRepository<Registrations, Integer> {
     List<Registrations> findRegistrationsByDentistId(Integer id);


}
