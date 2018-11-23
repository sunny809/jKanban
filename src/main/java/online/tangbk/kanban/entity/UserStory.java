package online.tangbk.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "user_story")
public class UserStory {
	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private int storyPoint;
	@Column
	private Status status;
	@OneToOne(targetEntity = User.class)
	private User assigned;
	@Column
	private int featureId;
}
