package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import online.tangbk.kanban.domain.model.DeveloperVo;
import online.tangbk.kanban.entity.Developer;
import online.tangbk.kanban.repository.DeveloperRepository;

@Service

public class DeveloperService implements BaseService<DeveloperVo> {

	@Autowired
	private DeveloperRepository repository;

	private MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

	private MapperFacade mapper = mapperFactory.getMapperFacade();

	@Override
	public void add(DeveloperVo t) {
		Developer developer = mapper.map(t, Developer.class);
		repository.save(developer);
	}

	@Override
	public void update(DeveloperVo t) {
		Developer developer = mapper.map(t, Developer.class);
		repository.save(developer);
	}

	@Override
	public DeveloperVo get(long id) {
		Developer developer = repository.getOne(id);
		return mapper.map(developer, DeveloperVo.class);
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);
	}

	@Override
	public List<DeveloperVo> list() {
		return mapperFactory.getMapperFacade().mapAsList(repository.findAll(), DeveloperVo.class);
	}

}
