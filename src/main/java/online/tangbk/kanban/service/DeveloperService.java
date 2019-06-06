package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.stereotype.Service;

import online.tangbk.kanban.domain.model.DeveloperVo;
import online.tangbk.kanban.entity.Developer;
import online.tangbk.kanban.repository.DeveloperRepository;

@Service

public class DeveloperService implements BaseService<DeveloperVo> {

	DeveloperRepository repository;

	@Override
	public void add(DeveloperVo t) {
		repository.save(t);
	}

	@Override
	public void update(DeveloperVo t) {
		repository.save(t);
	}

	@Override
	public Developer get(long id) {
		return repository.getOne(id);
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);

	}

	@Override
	public List<DeveloperVo> list() {
		return repository.findAll();
	}

}
