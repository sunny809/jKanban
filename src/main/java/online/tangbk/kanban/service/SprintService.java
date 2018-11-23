package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import online.tangbk.kanban.entity.Sprint;

@Service
public class SprintService extends BaseService<Sprint> {

	public SprintService(JpaRepository<Sprint, Long> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Sprint t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Sprint t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Sprint get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Sprint> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
