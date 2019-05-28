package online.tangbk.kanban.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;
import online.tangbk.kanban.domain.model.UserVo;
import online.tangbk.kanban.service.UserService;

@Controller
@Slf4j
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST, consumes = "")
	public void add(@RequestBody UserVo user) {
		userService.add(user);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void update(@RequestBody UserVo user) {

	}

	@RequestMapping(method = RequestMethod.GET, consumes = "")
	public List<UserVo> list() {

	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET, consumes = "")
	public UserVo get(@PathVariable String userId) {

	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void delete(@RequestBody UserVo user) {

	}

}
