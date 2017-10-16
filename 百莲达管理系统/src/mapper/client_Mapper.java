package mapper;

import java.util.List;

import model.client;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("client_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface client_Mapper extends Basic_mapper<client> {
	
	@Select("select client.*,user.*,user.name u_name from client inner join user on client.userid=user.id ${where}  ${order} ${limit}")
	public List<client> getall(pagemanage info);
	
	@Select("select  count(1) from client inner join user on client.userid=user.id ${where}")
	public Long getAllSize(pagemanage info);
	
	@Delete("delete from client where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into client(code,name,addr,tel,telmov,lxr,bank,createdate,userid,fexp) values(#{code},#{name},#{addr},#{tel},#{telmov},#{lxr},#{bank},#{createdate},#{userid},#{fexp})")
	public void insert(client b);
	
	@Select("select client.* from client where client.id = #{id}")
	public client getByID(int id);
	
	@Update("update client set code=#{code},name=#{name},addr=#{addr},tel=#{tel},telmov=#{telmov},lxr=#{lxr},bank=#{bank},userid=#{userid},fexp=#{fexp}  where id = #{id}")
	public void update(client b);
}
