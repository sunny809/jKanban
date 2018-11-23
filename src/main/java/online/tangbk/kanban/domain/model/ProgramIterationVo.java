package online.tangbk.kanban.domain.model;

import java.time.Year;
import java.util.List;

import lombok.Data;

@Data
public class ProgramIterationVo {
	private long id;
	private Year year;
	private int seq;
	private List<SprintVo> sprints;
}
