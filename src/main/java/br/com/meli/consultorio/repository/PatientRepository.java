package br.com.meli.consultorio.repository;

import br.com.meli.consultorio.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

     List<Patient> findByTurnsDay(LocalDate localDate) ;

}
