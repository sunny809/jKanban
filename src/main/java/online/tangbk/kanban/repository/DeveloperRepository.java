package online.tangbk.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import online.tangbk.kanban.entity.Developer;

@Repository
@Transactional
public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}
