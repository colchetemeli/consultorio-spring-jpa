package br.com.meli.consultorio.service;

import br.com.meli.consultorio.repository.DiaryRepository;
import br.com.meli.consultorio.entities.Diary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryService {

    private final DiaryRepository diaryRepository;

    @Autowired
    public DiaryService(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    public Diary create(Diary diary) {
        return this.diaryRepository.save(diary);
    }

    public List<Diary> listDiariesFromAnDentist(Long id) {
        return this.diaryRepository.findByDentistId(id);
    }

}
