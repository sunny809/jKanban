package online.tangbk.kanban.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "feature")
public class Feature extends BaseDataModel {

	@Id
	private long id;
	@Column
	private String title;
	@Column
	private String description;
	@OneToMany(mappedBy = "featureId", targetEntity = UserStory.class)
	private List<UserStory> userStorys;
	@OneToMany(mappedBy = "featureId", targetEntity = BussinessObjective.class)
	private List<BussinessObjective> objectives;
	@Column
	private int piId;

}
