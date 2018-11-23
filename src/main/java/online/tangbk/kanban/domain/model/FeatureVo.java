package online.tangbk.kanban.domain.model;

import java.util.List;

import lombok.Data;

@Data
public class FeatureVo {

	private long id;
	private ProgramIterationVo pi;
	private String title;
	private String description;
	private List<UserStoryVo> userStorys;

}
