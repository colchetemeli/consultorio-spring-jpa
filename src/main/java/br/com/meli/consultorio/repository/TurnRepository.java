package br.com.meli.consultorio.repository;

import br.com.meli.consultorio.entities.Turn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TurnRepository extends JpaRepository<Turn, Long> {

    List<Turn> findByTurnStatusName(String status);

//    public List<Turn> findByTurnStatusName(String status) {
//        TypedQuery<Turn> qryTurn = entityManager.createQuery("" +
//                "select t from Turn t " +
//                "left join TurnStatus  as ts on t.turnStatus.id = ts.id " +
//                "where ts.name = lower(:pName) ", Turn.class);
//
//        qryTurn.setParameter("pName", status.toLowerCase());
//
//        return qryTurn.getResultList();
//    }
}
