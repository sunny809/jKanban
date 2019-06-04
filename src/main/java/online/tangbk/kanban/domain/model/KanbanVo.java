package online.tangbk.kanban.domain.model;

import java.util.List;

import lombok.Data;
import online.tangbk.kanban.entity.Sprint;
import online.tangbk.kanban.entity.UserStory;

@Data
public class KanbanVo {

//	user-story pipeline
	private List<UserStory> backlog;
	private List<UserStory> ongoing;
	private List<UserStory> testing;
	private List<UserStory> done;

	private Sprint currentSprint;

}
