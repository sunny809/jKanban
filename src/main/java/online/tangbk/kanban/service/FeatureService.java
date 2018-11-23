package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import online.tangbk.kanban.entity.Feature;

@Service
public class FeatureService extends BaseService<Feature> {

	public FeatureService(JpaRepository<Feature, Long> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Feature t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Feature t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Feature get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Feature> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
