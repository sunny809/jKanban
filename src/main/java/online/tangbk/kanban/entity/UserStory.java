package online.tangbk.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@ToString(exclude = { "assigned" })
public class UserStory {
	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Status status;
	@OneToOne(targetEntity = User.class)
	private User assigned;

}
