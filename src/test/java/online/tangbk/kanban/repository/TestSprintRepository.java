package online.tangbk.kanban.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import online.tangbk.kanban.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class TestSprintRepository {

	static List<User> userList = new ArrayList<>();

	@Autowired
	SprintRepository repo;

	@BeforeClass
	public static void prepareData() {

	}

	@Test
	public void add() {

	}

	@Test
	public void get() {

	}

}
