package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.tangbk.kanban.entity.Task;
import online.tangbk.kanban.repository.TaskRepository;

@Service
public class UserStoryService implements BaseService<Task> {

	@Autowired
	private TaskRepository repository;

	@Override
	public void add(Task t) {

	}

	@Override
	public void update(Task t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Task get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Task> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
