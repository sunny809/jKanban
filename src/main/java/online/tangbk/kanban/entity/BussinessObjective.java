package online.tangbk.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "bussiness_objective")
@EqualsAndHashCode(callSuper = false)
public class BussinessObjective extends BaseDataModel {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String descrption;
	@Column
	private int value;
	@Column
	private int featureId;
}
