package online.tangbk.kanban.domain.model;

import lombok.Data;

@Data
public class UserStoryVo {
	private long id;
	private String name;
	private String description;
	private int storyPoint;
	private StatusVo status;
	private UserVo user;
}
