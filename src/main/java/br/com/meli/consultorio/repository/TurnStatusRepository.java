package br.com.meli.consultorio.repository;

import br.com.meli.consultorio.entities.TurnStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnStatusRepository extends JpaRepository<TurnStatus, Long> {
}
