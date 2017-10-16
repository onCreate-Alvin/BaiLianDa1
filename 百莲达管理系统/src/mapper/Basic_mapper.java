package mapper;

import java.util.List;

import utils.batchids;
import utils.pagemanage;

public interface Basic_mapper<T> {
	public List<T> getall(pagemanage info);
	public Long getAllSize(pagemanage info) ;
	public void delete(batchids ids);
	public void insert(T b);
	public T getByID(int id);
	public void update(T b);
}
