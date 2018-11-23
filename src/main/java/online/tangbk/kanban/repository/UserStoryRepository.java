package online.tangbk.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.tangbk.kanban.entity.UserStory;

@Repository
public interface UserStoryRepository extends JpaRepository<UserStory, Long> {

}
