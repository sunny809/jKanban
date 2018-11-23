package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import online.tangbk.kanban.entity.User;

@Service
public class UserService extends BaseService<User> {

	public UserService(JpaRepository<User, Long> repository) {
		super(repository);
	}

	@Override
	public void add(User t) {
		repository.save(t);
	}

	@Override
	public void update(User t) {
		repository.save(t);
	}

	@Override
	public User get(long id) {
		return repository.getOne(id);
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);

	}

	@Override
	public List<User> list() {
		return repository.findAll();
	}

}
