package online.tangbk.kanban.domain.model;

import java.util.List;

import lombok.Data;
import online.tangbk.kanban.entity.Task;

@Data
public class KanbanVo {

//	user-story pipeline
//	Todo task
	private List<Task> todo;
//	working in progress
	private List<Task> ongoing;
//	Test
	private List<Task> testing;
//	Review
	private List<Task> done;


}
