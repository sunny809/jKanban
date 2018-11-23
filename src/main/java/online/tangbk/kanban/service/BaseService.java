package online.tangbk.kanban.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseService<T> {

	JpaRepository<T, Long> repository;

	public BaseService(JpaRepository<T, Long> repository) {
		this.repository = repository;
	}

	abstract public void add(T t);

	abstract public void update(T t);

	abstract public T get(long id);

	abstract public void delete(long id);

	abstract public List<T> list();

}
