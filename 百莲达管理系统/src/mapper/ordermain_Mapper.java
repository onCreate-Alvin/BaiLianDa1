package mapper;

import java.util.List;

import model.ordermain;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("ordermain_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface ordermain_Mapper extends Basic_mapper<ordermain> {
	
	@Select("select ordermain.*,client.name clientname,vip.name vipname,a.name shopname,b.name destshopname,`user`.name username from ordermain left join client on ordermain.clientid=client.id left join vip on ordermain.vipid = vip.id left join shop a on ordermain.shopid = a.id left join shop b on ordermain.destshopid = b.id left join `user` on ordermain.userid = `user`.id ${where}  ${order} ${limit}")
	public List<ordermain> getall(pagemanage info);
	
	@Select("select  count(1)  from ordermain ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from ordermain where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into ordermain (ordercode,ordertype,orderdate,createdate,amount,point,vipid,shopid,userid,clientid,destshopid,status,fexp,vipamount) values(#{ordercode},#{ordertype},#{orderdate},#{createdate},#{amount},#{point},#{vipid},#{shopid},#{userid},#{clientid},#{destshopid},#{status},#{fexp},#{vipamount})")
	public void insert(ordermain b);
	
	@Select("select ordermain.* from ordermain where ordermain.id = #{id}")
	public ordermain getByID(int id);
	
	@Update("update ordermain set ordercode=#{ordercode},ordertype=#{ordertype},orderdate=#{orderdate},createdate=#{createdate},amount=#{amount},point=#{point},vipid=#{vipid},shopid=#{shopid},userid=#{userid},clientid=#{clientid},destshopid=#{destshopid},status=#{status},fexp=#{fexp},vipamount=#{vipamount}  where id = #{id}")
	public void update(ordermain b);
	
	@Select("select max(id) from ordermain")
	public int getlastID();
}
