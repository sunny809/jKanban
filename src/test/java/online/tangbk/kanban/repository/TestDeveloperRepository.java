package online.tangbk.kanban.repository;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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

	static List<Developer> developerList = new ArrayList<>();

	@Autowired
	DeveloperRepository repo;

	@BeforeClass
	public static void prepareData() {

		// build data
		buildUserStoryList();
	}

	static void buildUserStoryList() {

		Developer developer = new Developer();
		developer.setFirstName("1st user fistname");
		developer.setLastName("1st user lastname");
		developerList.add(developer);

		developer = new Developer();
		developer.setFirstName("2nd user fistname");
		developer.setLastName("2nd user lastname");
		developerList.add(developer);

		developer = new Developer();
		developer.setFirstName("3rd user fistname");
		developer.setLastName("3rd user lastname");
		developerList.add(developer);
	}

	@Before
	public void insertData() {

		for (Developer user : developerList) {
			repo.save(user);
		}

	}

	@After
	public void deleteData() {

		for (Developer user : developerList) {
			repo.delete(user);
		}

	}

	@Test
	public void add() {
		for (Developer user : developerList) {
			repo.save(user);

		}

		long size = repo.count();

		Assert.assertNotEquals(3l, size);
	}

	@Test
	public void get() {
		List<Developer> userList = repo.findAll();
		assertNotNull(userList);
		assertNotEquals(0, userList.size());
		for (Developer user : userList) {

		}
	}

	@Test
	public void delete() {
		List<Developer> userList = repo.findAll();
		assertNotNull(userList);
		assertNotEquals(0, userList.size());
		for (Developer user : userList) {
			repo.deleteById(user.getId());
		}
		userList = repo.findAll();
		assertEquals(0, userList.size());
	}

}
