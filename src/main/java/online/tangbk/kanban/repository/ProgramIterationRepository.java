package online.tangbk.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.tangbk.kanban.entity.ProgramIteration;

@Repository
public interface ProgramIterationRepository extends JpaRepository<ProgramIteration, Long> {

}
