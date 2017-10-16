package mapper;

import java.util.List;

import model.viptype;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("viptype_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface viptype_Mapper extends Basic_mapper<viptype> {
	
	@Select("select * from viptype ${where}   ${order} ${limit}")
	public List<viptype> getall(pagemanage info);
	
	@Select("select  count(1)  from viptype ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from viptype where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into viptype(name,fexp) values(#{name},#{fexp})")
	public void insert(viptype b);
	
	@Select("select viptype.* from viptype where viptype.id = #{id}")
	public viptype getByID(int id);
	
	@Update("update viptype set name=#{name},fexp=#{fexp}  where id = #{id}")
	public void update(viptype b);
}
