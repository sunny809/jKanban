package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.stereotype.Service;

import online.tangbk.kanban.domain.model.UserVo;
import online.tangbk.kanban.entity.User;
import online.tangbk.kanban.repository.UserRepository;

@Service
public class UserService implements BaseService<UserVo> {

	UserRepository repository;

	@Override
	public void add(UserVo t) {
		repository.save(t);
	}

	@Override
	public void update(UserVo t) {
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
	public List<UserVo> list() {
		return repository.findAll();
	}

}
