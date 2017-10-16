package service;

import java.util.List;

import utils.batchids;
import utils.pagemanage;

public interface BasicService<T> {
	public List<T> getall(pagemanage info);
	public long getAllSize(pagemanage sea);
	public void del(batchids ids);
	public void insert(T b);
	public T getbyid(int id);
	public void update(T b);  
}
