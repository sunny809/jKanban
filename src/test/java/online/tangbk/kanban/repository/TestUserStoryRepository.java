//package online.tangbk.kanban.repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import online.tangbk.kanban.domain.model.BussinessValue;
//import online.tangbk.kanban.domain.model.Difficulty;
//import online.tangbk.kanban.domain.model.StatusVo;
//import online.tangbk.kanban.domain.model.UserStoryVo;
//import online.tangbk.kanban.entity.UserStory;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class TestUserStoryRepository {
//
//	static List<UserStoryVo> userStoryList = new ArrayList<>();
//
//	@Autowired
//	UserStoryRepository repo;
//
//	private ModelMapper modelMapper = new ModelMapper();
//
//	@BeforeClass
//	public static void prepareData() {
//
//		// build data
//		buildUserStoryList();
//	}
//
//	static void buildUserStoryList() {
//
//		UserStoryVo usm1 = new UserStoryVo();
//		usm1.setName("user story1");
//		usm1.setStatus(StatusVo.BackLog);
//		usm1.setStoryPoint(5);
//		usm1.setUserName("sunnydeng");
//		usm1.setDescription("the story point descrption");
//		usm1.setBussinessValue(BussinessValue.Low);
//		usm1.setDiffculty(Difficulty.Easy);
//		usm1.setStatus(StatusVo.InProgress);
//
//		userStoryList.add(usm1);
//
//		UserStoryVo usm2 = new UserStoryVo();
//		usm2.setName("user story2");
//		usm2.setStatus(StatusVo.BackLog);
//		usm2.setStoryPoint(5);
//		usm2.setUserName("sunnydeng");
//		usm2.setDescription("the story point descrption");
//		usm2.setBussinessValue(BussinessValue.Low);
//		usm2.setDiffculty(Difficulty.Easy);
//		usm2.setStatus(StatusVo.InProgress);
//
//		userStoryList.add(usm2);
//
//		UserStoryVo usm3 = new UserStoryVo();
//		usm3.setName("user story3");
//		usm3.setStatus(StatusVo.BackLog);
//		usm3.setStoryPoint(5);
//		usm3.setUserName("sunnydeng");
//		usm3.setDescription("the story point descrption");
//		usm3.setBussinessValue(BussinessValue.Low);
//		usm3.setDiffculty(Difficulty.Easy);
//		usm3.setStatus(StatusVo.InProgress);
//
//		userStoryList.add(usm3);
//
//	}
//
//	@Test
//	public void add() {
//		for (UserStoryVo usm : userStoryList) {
//			UserStory us = modelMapper.map(usm, UserStory.class);
//			repo.save(us);
//		}
//
//		long size = repo.count();
//
//		Assert.assertEquals(3l, size);
//	}
//
//	@Test
//	public void delete() {
//
//		List<UserStory> usList = repo.findAll();
//
//		for (UserStory us : usList) {
//			repo.deleteById(us.getId());
//		}
//
//		long size = repo.count();
//
//		Assert.assertEquals(0l, size);
//	}
//
//	@Test
//	public void update() {
//
//		List<UserStory> usList = repo.findAll();
//
//		for (UserStory us : usList) {
//			repo.deleteById(us.getId());
//		}
//
//		long size = repo.count();
//
//		Assert.assertEquals(0l, size);
//	}
//}
