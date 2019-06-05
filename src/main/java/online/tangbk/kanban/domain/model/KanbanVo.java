package online.tangbk.kanban.domain.model;

import java.util.List;

import lombok.Data;
import online.tangbk.kanban.entity.UserStory;

@Data
public class KanbanVo {

//	user-story pipeline
//	Todo task
	private List<UserStory> todo;
//	working in progress
	private List<UserStory> ongoing;
//	Test
	private List<UserStory> testing;
//	Review
	private List<UserStory> done;


}
