package br.com.meli.consultorio.repository;

import br.com.meli.consultorio.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

     List<Patient> findByTurnsDay(LocalDate localDate) ;
//    {
//        TypedQuery<Patient> qryPatient = entityManager.createQuery("select p from Patient p " +
//                        "left join Turn as t on p.id = t.patient.idPatient where t.day = :pDate " +
//                        "group by p",
//                Patient.class);
//
//        qryPatient.setParameter("pDate", LocalDate.parse(date));
//
//        List<Patient> patients = qryPatient.getResultList();
//
//        return patients;
//    }

}
