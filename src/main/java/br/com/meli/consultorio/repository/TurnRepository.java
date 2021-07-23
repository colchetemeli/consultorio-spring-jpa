package br.com.meli.consultorio.repository;

import br.com.meli.consultorio.entities.Turn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TurnRepository extends JpaRepository<Turn, Long> {

    List<Turn> findByTurnStatusName(String status);

}
