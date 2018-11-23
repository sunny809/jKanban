package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import online.tangbk.kanban.entity.BussinessObjective;

@Service
public class BussinessObjectiveService extends BaseService<BussinessObjective> {

	public BussinessObjectiveService(JpaRepository<BussinessObjective, Long> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(BussinessObjective t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(BussinessObjective t) {
		// TODO Auto-generated method stub

	}

	@Override
	public BussinessObjective get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BussinessObjective> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
