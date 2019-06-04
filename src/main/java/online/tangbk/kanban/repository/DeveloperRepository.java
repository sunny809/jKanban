package online.tangbk.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.tangbk.kanban.entity.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}
