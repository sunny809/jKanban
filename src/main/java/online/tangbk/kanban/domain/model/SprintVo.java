package online.tangbk.kanban.domain.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class SprintVo {
	private long id;
	private ProgramIterationVo pi;
	private int springNumber;
	private int capbiblity;
	private int capacity;
	private String remark;
	private Date start;
	private Date end;
	private List<UserStoryVo> userStorys;
}
