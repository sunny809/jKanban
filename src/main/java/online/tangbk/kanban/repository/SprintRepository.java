package online.tangbk.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.tangbk.kanban.entity.Sprint;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, Long> {

}
