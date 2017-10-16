package serviceImpl;

import java.lang.reflect.Field;
import java.util.List;

import mapper.Basic_mapper;
import utils.batchids;
import utils.pagemanage;

public class Basic_serviceImpl<T> {
	
	private Basic_mapper getMapper(){
		try {
			Field o = getClass().getDeclaredField("mapper");
			o.setAccessible(true);
			return (Basic_mapper) o.get(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<T> getall(pagemanage info) {
		if(info.getWhere()==null||info.getWhere().length()<=7){
			info.setWhere("");
		}
		return getMapper().getall(info);
	}
	public long getAllSize(pagemanage info) {
		return getMapper().getAllSize(info);
	}
	public void del(batchids batchids){
		getMapper().delete(batchids);
	}
	public void insert(T b){
		getMapper().insert(b);
	}
	public T getbyid(int id) {
	return (T) getMapper().getByID(id);
	}
	public void update(T b){
		 getMapper().update(b);
	}
}
