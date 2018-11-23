//package online.tangbk.kanban.controller;
//
//import java.util.Date;
//import java.util.LinkedList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import lombok.extern.slf4j.Slf4j;
//import online.tangbk.kanban.domain.model.BussinessValue;
//import online.tangbk.kanban.domain.model.Difficulty;
//import online.tangbk.kanban.domain.model.UserStoryVo;
//import online.tangbk.kanban.entity.UserStory;
//import online.tangbk.kanban.repository.UserStoryRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@Slf4j
//public class TestUserStoryController {
//
//	private MockMvc mvc;
//
//	@Autowired
//	private WebApplicationContext context;
//
//	@Autowired
//	private UserStoryRepository repo;
//
//	static List<UserStory> preparedData = new LinkedList<>();
//
//	@BeforeClass
//	public static void prepareData() {
//		UserStory us1 = new UserStory();
//		us1.setName("US-001");
//		us1.setDescription("a user sotry a");
//		us1.setBussinessValue(BussinessValue.Medium);
//		us1.setDifficulty(Difficulty.Medium);
//		us1.setCreateTimestamp(new Date());
//		us1.setStoryPoint(5);
//		us1.setUserName("user-a");
//
//		UserStory us2 = new UserStory();
//		us2.setName("US-002");
//		us2.setDescription("a user sotry b");
//		us2.setBussinessValue(BussinessValue.Medium);
//		us2.setDifficulty(Difficulty.Medium);
//		us2.setCreateTimestamp(new Date());
//		us2.setStoryPoint(5);
//		us2.setUserName("user-b");
//
//		UserStory us3 = new UserStory();
//		String name = "US-003";
//		us3.setName(name);
//		us3.setDescription("a user sotry c");
//		us3.setBussinessValue(BussinessValue.Medium);
//		us3.setDifficulty(Difficulty.Medium);
//		us3.setCreateTimestamp(new Date());
//		us3.setStoryPoint(5);
//		us3.setUserName("user-c");
//
//		UserStory us4 = new UserStory();
//		us4.setName("US-004");
//		us4.setDescription("a user sotry d");
//		us4.setBussinessValue(BussinessValue.Medium);
//		us4.setDifficulty(Difficulty.Medium);
//		us4.setCreateTimestamp(new Date());
//		us4.setStoryPoint(5);
//		us4.setUserName("user-d");
//
//		UserStory us5 = new UserStory();
//		us5.setName("US-005");
//		us5.setDescription("a user sotry e");
//		us5.setBussinessValue(BussinessValue.Medium);
//		us5.setDifficulty(Difficulty.Medium);
//		us5.setCreateTimestamp(new Date());
//		us5.setStoryPoint(5);
//		us5.setUserName("user-e");
//		preparedData.add(us1);
//		preparedData.add(us2);
//		preparedData.add(us3);
//		preparedData.add(us4);
//		preparedData.add(us5);
//	}
//
//	@Before
//	public void setupMockMvc() throws Exception {
//		mvc = MockMvcBuilders.webAppContextSetup(context).build();
//		repo.deleteAll();
//		repo.saveAll(preparedData);
//	}
//
//	@Test
//	public void create() {
//		UserStoryVo usm = new UserStoryVo();
//		String name = "CVCDEV-001";
//		usm.setName(name);
//		usm.setDescription("a user sotry");
//		usm.setBussinessValue(BussinessValue.Medium);
//		usm.setDiffculty(Difficulty.Medium);
//		usm.setCreateTimestamp(new Date());
//		usm.setStoryPoint(5);
//		usm.setUserName("BingJian");
//
//		try {
//			mvc.perform(MockMvcRequestBuilders.post("/api/v1/user-story", usm))
//					.andExpect(MockMvcResultMatchers.status().isCreated());
//
//			// List<UserStory> usList = repo.findByName(name);
//			// assertEquals(1, usList.size());
//			// UserStory us = usList.get(0);
//			//
//			// log.info(us.toString());
//			//
//			// assertEquals(name, us.getName());
//
//			// mvc.perform(MockMvcRequestBuilders.post("/user-story")).andExpect(MockMvcResultMatchers.status().isOk());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			log.error("", e);
//			e.printStackTrace();
//		}
//	}
//
//	//
//	// @Test
//	// public void update() {
//	// try {
//	// mvc.perform(MockMvcRequestBuilders.get("/user-story")).andExpect(MockMvcResultMatchers.status().isOk());
//	// } catch (Exception e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	// }
//	//
//	// @Test
//	// public void getById() {
//	// try {
//	// mvc.perform(MockMvcRequestBuilders.get("/user-story")).andExpect(MockMvcResultMatchers.status().isOk());
//	// } catch (Exception e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	// }
//	//
//	@Test
//	public void getAllUs() {
//		try {
//			mvc.perform(MockMvcRequestBuilders.get("/api/v1/user-story"))
//					.andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
//					.andExpect(MockMvcResultMatchers.model().attributeExists("username"))
//					.andDo(MockMvcResultHandlers.print());
//		} catch (Exception e) {
//			log.error("", e);
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	//
//	// @Test
//	// public void delete() {
//	// try {
//	// mvc.perform(MockMvcRequestBuilders.get("/user-story")).andExpect(MockMvcResultMatchers.status().isOk());
//	// } catch (Exception e) {
//	// // TODO Auto-generated catch block
//	// e.printStackTrace();
//	// }
//	// }
//}
