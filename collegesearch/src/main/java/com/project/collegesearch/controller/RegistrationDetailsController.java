package com.project.collegesearch.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.collegesearch.entity.RegistrationDetails;
import com.project.collegesearch.rapo.RegistrationDetailsRepository;

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/")
public class RegistrationDetailsController {
   @Autowired
   private RegistrationDetailsRepository registrationDetailsRepository;

   @PostMapping("/save")
   public RegistrationDetails saveRegistrationDetails(@RequestBody RegistrationDetails registrationDetails) {
       return registrationDetailsRepository.save(registrationDetails);
   }

   @GetMapping("/all")
   public List<RegistrationDetails> getAllRegistrationDetails() {
       return registrationDetailsRepository.findAll();
   }
   @PutMapping("/{id}")
   public ResponseEntity<RegistrationDetails> updateRegistrationDetails(@PathVariable Long id,
           @RequestBody RegistrationDetails updatedDetails) {
       Optional<RegistrationDetails> optionalDetails = registrationDetailsRepository.findById(id);
       if (optionalDetails.isPresent()) {
           RegistrationDetails registrationDetails = optionalDetails.get();
           registrationDetails.updateFields(updatedDetails);
           registrationDetailsRepository.save(registrationDetails);
           return ResponseEntity.ok(registrationDetails);
       } else {
           return ResponseEntity.notFound().build();
       }
}}
