package online.tangbk.kanban.service;

import java.util.List;

public interface BaseService<T> {

	public void add(T t);

	public void update(T t);

	public T get(long id);

	public void delete(long id);

	public List<T> list();

}
