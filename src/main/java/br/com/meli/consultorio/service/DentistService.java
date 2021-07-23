package br.com.meli.consultorio.service;

import br.com.meli.consultorio.entities.Dentist;
import br.com.meli.consultorio.repository.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DentistService {

    private final DentistRepository dentistRepository;

    @Autowired
    public DentistService(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    public List<Dentist> listDentistsHasTwoTurnsByDate(String date) {
        return this.dentistRepository.listDentistsHasTwoTurnsByDate(LocalDate.parse(date));
    }

    public Dentist create(Dentist dentist) {
        return this.dentistRepository.save(dentist);
    }
}
