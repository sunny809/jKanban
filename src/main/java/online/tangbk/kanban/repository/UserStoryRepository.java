package online.tangbk.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.tangbk.kanban.entity.Task;

@Repository
public interface UserStoryRepository extends JpaRepository<Task, Long> {

}
