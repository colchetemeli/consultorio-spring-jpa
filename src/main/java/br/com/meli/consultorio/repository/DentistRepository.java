package br.com.meli.consultorio.repository;

import br.com.meli.consultorio.entities.Dentist;
import br.com.meli.consultorio.entities.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface DentistRepository extends JpaRepository<Dentist, Long> {

    @Query(value = "select de from Dentist de " +
                         "left join Diary as d on de.id = d.dentist.id " +
                        "left join Turn as t on d.id = t.diary.id " +
                        "where t.day = :pDate " +
                        "group by de " +
                        "having count(de) > 2" )
     List<Dentist> listDentistsHasTwoTurnsByDate(@Param(value = "pDate")LocalDate localDate);

}
