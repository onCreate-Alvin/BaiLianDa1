package mapper;

import java.util.List;

import model.shop;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("shop_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface shop_Mapper extends Basic_mapper<shop> {
	
	@Select("select shop.*,user.* ,user.name u_name from shop inner join user on shop.userid=user.id ${where} ${order} ${limit}")
	public List<shop> getall(pagemanage info);
	
	@Select("select  count(1)  from shop inner join user on shop.userid=user.id ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from shop where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into shop(code,name,addr,tel,telmov,createdate,userid,fexp) values(#{code},#{name},#{addr},#{tel},#{telmov},#{createdate},#{userid},#{fexp})")
	public void insert(shop b);
	
	@Select("select shop.* from shop where shop.id = #{id}")
	public shop getByID(int id);
	
	@Update("update shop set code=#{code},name=#{name},addr=#{addr},tel=#{tel},telmov=#{telmov},fexp=#{fexp}  where id = #{id}")
	public void update(shop b);
}
