package br.com.meli.consultorio.controllers;

import br.com.meli.consultorio.entities.Dentist;
import br.com.meli.consultorio.entities.Diary;
import br.com.meli.consultorio.service.DentistService;
import br.com.meli.consultorio.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consultorio/dentist")
public class DentistController {

    private DentistService dentistService;
    private DiaryService diaryService;

    @Autowired
    public DentistController(DentistService dentistService, DiaryService diaryService) {
        this.diaryService = diaryService;
        this.dentistService = dentistService;
    }

    @PostMapping
    public Dentist create(@RequestBody Dentist dentist) {
        return this.dentistService.create(dentist);
    }

    @GetMapping
    public List<Dentist> listDentistsHasTwoTurnsByDate(@RequestParam String date) {
        return this.dentistService.listDentistsHasTwoTurnsByDate(date);
    }

    @GetMapping("/{id}/diary")
    public List<Diary> listDiariesFromAnDentist(@PathVariable Long id) {
        return this.diaryService.listDiariesFromAnDentist(id);
    }
}
