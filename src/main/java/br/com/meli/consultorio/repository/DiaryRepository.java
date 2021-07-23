package br.com.meli.consultorio.repository;

import br.com.meli.consultorio.entities.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary, Long> {

    List<Diary> findByDentistId(Long id);

}
