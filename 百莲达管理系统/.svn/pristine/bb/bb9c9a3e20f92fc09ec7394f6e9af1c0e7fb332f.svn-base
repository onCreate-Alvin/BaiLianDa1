package mapper;

import java.util.List;

import model.vip;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("vip_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface vip_Mapper extends Basic_mapper<vip> {
	
	@Select("select vip.*,viptype.*,shop.*,user.* ,shop.name s_name,user.name u_name from vip inner join user on vip.userid=user.id inner join viptype on vip.viptypeid=viptype.id inner join shop on vip.shopid=shop.id ${where}   ${order} ${limit}")
	public List<vip> getall(pagemanage info);
	
	@Select("select  count(1) from vip inner join user on vip.userid=user.id inner join viptype on vip.viptypeid=viptype.id inner join shop on vip.shopid=shop.id ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from vip where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into vip(code,name,shopid,viptypeid,sex,addr,tel,telmov,birthdate,ccode,amount,point,status,createdate,userid,jsr,fexp) values(#{code},#{name},#{shopid},#{viptypeid},#{sex},#{addr},#{tel},#{telmov},#{birthdate},#{ccode},#{amount},#{point},#{status},#{createdate},#{userid},#{jsr},#{fexp})")
	public void insert(vip b);
	
	@Select("select vip.* from vip where vip.id = #{id}")
	public vip getByID(int id);
	
	@Update("update vip set code=#{code},name=#{name},shopid=#{shopid},viptypeid=#{viptypeid},sex=#{sex},addr=#{addr},tel=#{tel},telmov=#{telmov},birthdate=#{birthdate},ccode=#{ccode},amount=#{amount},point=#{point},status=#{status},userid=#{userid},jsr=#{jsr},fexp=#{fexp}  where id = #{id}")
	public void update(vip b);
}
