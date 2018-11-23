package online.tangbk.kanban.domain.model;

import lombok.Data;

@Data
public class BussinessObjectiveVo {
	private long id;
	private UserStoryVo belongUserStory;
	private String descrption;
	private int value;
}
