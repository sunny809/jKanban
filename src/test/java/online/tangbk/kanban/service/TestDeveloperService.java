package online.tangbk.kanban.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import online.tangbk.kanban.domain.model.DeveloperVo;
import online.tangbk.kanban.repository.DeveloperRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestDeveloperService {

	static List<DeveloperVo> developerList = new ArrayList<>();

	@Autowired
	DeveloperService developerService;

	@Autowired
	DeveloperRepository developerRepo;

	@BeforeClass
	public static void prepareData() {

		// build data
		buildUserStoryList();
	}

	static void buildUserStoryList() {

		DeveloperVo developer = null;

		for (int index = 0; index < 10; index++) {
			developer = new DeveloperVo();

			developer.setFirstName(String.format("first_name_%s", index));
			developer.setLastName(String.format("last_name_%s", index));
//			developer.setEmailAddress(String.format("email_%s", index));

			developerList.add(developer);
		}

	}

	@Test
	public void addAll() {

		for (DeveloperVo developer : developerList) {
			developerService.add(developer);
		}

	}

	@Test
	public void get() {
		List<DeveloperVo> list = developerService.list();
		for (DeveloperVo developer : list) {
			assertNotNull(developer);
		}
	}

	@Test
	public void update() {
		List<DeveloperVo> list = developerService.list();
		DeveloperVo developer = list.get(0);
		developer.setFirstName("a new name");
		developerService.update(developer);
	}

//	
	@Test
	public void delete() {
		List<DeveloperVo> list = developerService.list();

		for (DeveloperVo developer : list) {
			developerService.delete(developer.getId());
			break;
		}

	}

}
