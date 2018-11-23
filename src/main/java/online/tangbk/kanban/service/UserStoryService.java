package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import online.tangbk.kanban.entity.UserStory;

@Service
public class UserStoryService extends BaseService<UserStory> {
	public UserStoryService(JpaRepository<UserStory, Long> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(UserStory t) {
		
	}

	@Override
	public void update(UserStory t) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserStory get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserStory> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
