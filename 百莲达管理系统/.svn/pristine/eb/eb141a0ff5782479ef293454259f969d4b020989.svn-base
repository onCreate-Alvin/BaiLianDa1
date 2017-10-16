package mapper;

import java.util.List;

import model.checkmain;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("checkmain_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface checkmain_Mapper extends Basic_mapper<checkmain> {
	
	@Select("select checkmain.*,shop.name shopname from checkmain left join shop on checkmain.shopid = shop.id ${where}  ${order} ${limit}")
	public List<checkmain> getall(pagemanage info);
	
	@Select("select  count(1)  from checkmain ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from checkmain where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into checkmain(checkcode,checkname,checkdate,shopid,status,fexp) values(#{checkcode},#{checkname},#{checkdate},#{shopid},#{status},#{fexp})")
	public void insert(checkmain b);
	
	@Select("select checkmain.* from checkmain where checkmain.id = #{id}")
	public checkmain getByID(int id);
	
	@Update("update checkmain set checkcode=#{checkcode},checkname=#{checkname},checkdate=#{checkdate},shopid=#{shopid},status=#{status},fexp=#{fexp}  where id = #{id}")
	public void update(checkmain b);
	
	@Select("select max(id) from ordermain")
	public int getlastID();
}
