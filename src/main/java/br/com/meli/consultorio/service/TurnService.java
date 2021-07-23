package br.com.meli.consultorio.service;

import br.com.meli.consultorio.entities.Turn;
import br.com.meli.consultorio.repository.TurnRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnService {

    private final TurnRepository turnRepository;

    public TurnService(TurnRepository turnRepository) {
        this.turnRepository = turnRepository;
    }

    public Turn create(Turn turn) {
        return turnRepository.save(turn);
    }

    public List<Turn> listTurnByStatus(String status) {
        return this.turnRepository.findByTurnStatusName(status);
    }
}
