package br.com.meli.consultorio.repository;

import br.com.meli.consultorio.entities.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
    List<Diary> findByDentistId(Long id);

    //public List<Diary> listDiariesFromAnDentist(Long id);
//
//        TypedQuery<Diary> qryDentistDiary = entityManager.createQuery("" +
//                "select d from Diary d, Dentist de " +
//                "where d.dentist.id = de.id and de.id = :pId ", Diary.class);
//
//        qryDentistDiary.setParameter("pId", id);
//
//        return qryDentistDiary.getResultList();
//    }
}
