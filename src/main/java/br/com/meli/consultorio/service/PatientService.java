package br.com.meli.consultorio.service;

import br.com.meli.consultorio.repository.PatientRepository;
import br.com.meli.consultorio.entities.Patient;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> listAllPatientsByDay(String date) {
        return this.patientRepository.findByTurnsDay(LocalDate.parse(date));
    }

    public Patient create(Patient patient) {
        return this.patientRepository.save(patient);
    }
}
