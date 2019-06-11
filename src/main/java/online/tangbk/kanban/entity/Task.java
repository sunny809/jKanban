package online.tangbk.kanban.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import online.tangbk.kanban.domain.model.TaskType;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@ToString(exclude = { "assigned" })
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Status status;
	@OneToOne(targetEntity = Developer.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Developer assigned;
	@Column
	private Date startDate;
	@Column
	private Date completeDate;
	@Column
	private TaskType type;

}
