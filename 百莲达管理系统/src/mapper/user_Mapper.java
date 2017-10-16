package mapper;

import java.util.List;

import model.user;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("user_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface user_Mapper extends Basic_mapper<user> {
	
	@Select("select user.*, shop.*,u.name as u_name,u.code as u_code,u.sex as u_sex,u.tel as u_tel,u.telmov as u_telmov from  user inner join user as u on user.userid=u.id inner join shop on user.shopid=shop.id  ${where}  ${order} ${limit}")
	public List<user> getall(pagemanage info);
	
	@Select("select  count(1)  from user ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from user where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into user(code,name,pass,shopid,sex,addr,tel,telmov,birthdate,ccode,status,createdate,enterdate,exitdate,userid,fright,fexp) values(#{code},#{name},#{pass},#{shopid},#{sex},#{addr},#{tel},#{telmov},#{birthdate},#{ccode},#{status},#{createdate},#{enterdate},#{exitdate},#{userid},#{fright},#{fexp})")
	public void insert(user b);
	
	@Select("select user.* from user where user.id = #{id}")
	public user getByID(int id);
	
	@Update("update user set code=#{code},name=#{name},shopid=#{shopid},sex=#{sex},addr=#{addr},tel=#{tel},telmov=#{telmov},birthdate=#{birthdate},ccode=#{ccode},status=#{status},enterdate=#{enterdate},exitdate=#{exitdate},fright=#{fright},fexp=#{fexp} where id = #{id}")
	public void update(user b);
	
	@Select("select user.* from user where user.code = #{code}")
	public user getByCode(String code);
	
	@Update("update user set pass=#{pass} where id=#{id}")
	public void updatepass(user u);
}
