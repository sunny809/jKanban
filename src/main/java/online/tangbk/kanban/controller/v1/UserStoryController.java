package online.tangbk.kanban.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import online.tangbk.kanban.service.UserStoryService;

@Controller
@Slf4j
@RequestMapping("/api/v1")
public class UserStoryController {

	@Autowired
	UserStoryService userStoryService;
	
	
	
	

}

