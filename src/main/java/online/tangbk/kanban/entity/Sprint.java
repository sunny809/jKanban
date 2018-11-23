package online.tangbk.kanban.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "sprint")
public class Sprint extends BaseDataModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToOne(targetEntity = ProgramIteration.class)
	private ProgramIteration pi;

	@Column
	private int seq;
	@Column
	private int capbiblity;
	@Column
	private int capacity;
	@Column
	private String remark;
	@Column
	private Date start;
	@Column
	private Date end;
	@ManyToMany(targetEntity = UserStory.class)
	@JoinTable(name = "sprint_userstory", joinColumns = { @JoinColumn(name = "sprint_id") }, inverseJoinColumns = {
			@JoinColumn(name = "userstory_id") })
	private List<UserStory> userStorys;
}
