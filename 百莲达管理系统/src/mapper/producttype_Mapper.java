package mapper;

import java.util.List;

import model.producttype;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("producttype_Mapper")//����mapper�����ݿ⣬���ø���ǰ��bean����һ�����֣���������λ��ʹ��
public interface producttype_Mapper extends Basic_mapper<producttype> {
	
	@Select("select * from producttype ${where}   ${order} ${limit}")
	public List<producttype> getall(pagemanage info);
	
	@Select("select  count(1)  from producttype ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from producttype where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into producttype(name,fexp) values(#{name},#{fexp})")
	public void insert(producttype b);
	
	@Select("select producttype.* from producttype where producttype.id = #{id}")
	public producttype getByID(int id);
	
	@Update("update producttype set name=#{name},fexp=#{fexp}  where id = #{id}")
	public void update(producttype b);
}
