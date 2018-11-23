package online.tangbk.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.tangbk.kanban.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
