package br.com.meli.consultorio.service;

import br.com.meli.consultorio.repository.TurnStatusRepository;
import br.com.meli.consultorio.entities.TurnStatus;
import org.springframework.stereotype.Service;

@Service
public class TurnStatusService {

    private final TurnStatusRepository turnStatusRepository;

    public TurnStatusService(TurnStatusRepository turnStatusRepository) {
        this.turnStatusRepository = turnStatusRepository;
    }

    public TurnStatus create(TurnStatus turnStatus) {
        return turnStatusRepository.save(turnStatus);
    }
}
