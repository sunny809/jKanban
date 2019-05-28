package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.tangbk.kanban.entity.UserStory;
import online.tangbk.kanban.repository.UserStoryRepository;

@Service
public class UserStoryService implements BaseService<UserStory> {

	@Autowired
	private UserStoryRepository repository;

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
