package online.tangbk.kanban.entity;

import java.time.Year;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "program_iteration")
public class ProgramIteration extends BaseDataModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "year", nullable = true)
	private Year year;
	@Column(name = "seq", nullable = true)
	private int seq;
	@OneToMany(mappedBy = "pi", targetEntity = Sprint.class)
	private List<Sprint> sprints;
	@OneToMany(mappedBy = "piId", targetEntity = Feature.class)
	private List<Feature> features;
}
