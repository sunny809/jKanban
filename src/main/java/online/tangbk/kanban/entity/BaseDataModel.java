package online.tangbk.kanban.entity;

import java.util.Date;

import javax.persistence.Column;

public abstract class BaseDataModel {

	@Column
	Date createdAt;

	@Column()
	String createRef;

	@Column
	Date lastUpdateAt;

	@Column()
	String lastUpdateRef;

	@Column()
	boolean isDelete;
}
