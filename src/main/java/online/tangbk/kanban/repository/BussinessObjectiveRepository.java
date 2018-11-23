package online.tangbk.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.tangbk.kanban.entity.BussinessObjective;

@Repository
public interface BussinessObjectiveRepository extends JpaRepository<BussinessObjective, Long> {

}
