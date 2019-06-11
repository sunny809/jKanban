package online.tangbk.kanban.repository;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import online.tangbk.kanban.domain.model.TaskType;
import online.tangbk.kanban.entity.Developer;
import online.tangbk.kanban.entity.Status;
import online.tangbk.kanban.entity.Task;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestTaskRepository {

	static List<Task> taskList = new ArrayList<>();

	@Autowired
	private TaskRepository taskRepo;

	@Autowired
	private DeveloperRepository developerRepo;

	private ModelMapper modelMapper = new ModelMapper();

	@Test
	public void add() {
//		adding a single user
		Developer developer = new Developer();
		developer.setFirstName("the task developer");
		developer.setLastName("testing");
		developer.setEmailAddress("abc@abc.com");
		developer = developerRepo.save(developer);
//		adding a task
		Task task = new Task();
		task.setAssigned(developer);
		task.setName("add testing name");
		task.setDescription("add testing description");
		Date currentDate = Calendar.getInstance().getTime();
		task.setCompleteDate(currentDate);
		task.setStartDate(currentDate);
		task.setCompleteDate(currentDate);
		task.setType(TaskType.UserStory);
		task.setStatus(Status.BackLog);
		task.setAssigned(developer);

		task = taskRepo.save(task);
		long taskId = task.getId();

		task = taskRepo.getOne(taskId);

		assertEquals("add testing name", task.getName());
		assertEquals("add testing descrption", task.getDescription());
		assertEquals(currentDate, task.getStartDate());
		assertEquals(TaskType.UserStory, task.getType());

	}

}
