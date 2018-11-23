package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import online.tangbk.kanban.entity.ProgramIteration;

@Service
public class ProgramIterationService extends BaseService<ProgramIteration> {

	public ProgramIterationService(JpaRepository<ProgramIteration, Long> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ProgramIteration t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ProgramIteration t) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProgramIteration get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ProgramIteration> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
