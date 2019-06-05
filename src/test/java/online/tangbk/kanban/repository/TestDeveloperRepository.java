package online.tangbk.kanban.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import online.tangbk.kanban.entity.Developer;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class TestDeveloperRepository {

	static List<Developer> userList = new ArrayList<>();

	@Autowired
	DeveloperRepository repo;

	@BeforeClass
	public static void prepareData() {

		// build data
		buildUserStoryList();
	}

	static void buildUserStoryList() {

		Developer user = new Developer();
		user.setFirstName("1st user fistname");
		user.setLastName("1st user lastname");
		userList.add(user);

		user = new Developer();
		user.setFirstName("2nd user fistname");
		user.setLastName("2nd user lastname");
		userList.add(user);

		user = new Developer();
		user.setFirstName("3rd user fistname");
		user.setLastName("3rd user lastname");
		userList.add(user);
	}

	@Test
	public void add() {
		for (Developer user : userList) {
			repo.save(user);

		}

		long size = repo.count();

		Assert.assertEquals(3l, size);
	}

	@Test
	public void get() {
		List<Developer> userList = repo.findAll();
		for (Developer user : userList) {
			log.info("user:" + user.toString());
		}
	}

}
