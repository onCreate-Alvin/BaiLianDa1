package mapper;

import java.util.List;

import model.tj_all;
import model.tj_product;
import model.tj_shop;
import model.tj_user;
import model.tj_vip;
import model.tj_vipmx;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;
import utils.tjinfo;

@Repository("tj_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface tj_Mapper extends Basic_mapper<tj_vipmx> {
	
	@Select("call tj_vipmx(#{id})")
	public List<tj_vipmx> gettjByVipId(int id);
	
	@Select("call tj_vip(#{s_where},#{sdate},#{ddate})")
	public List<tj_vip> gettjAllVip(tjinfo info);
	
	@Select("call tj_user(#{s_where},#{sdate},#{ddate})")
	public List<tj_user> gettjAllUser(tjinfo info);
	
	@Select("call tj_shop(#{s_where},#{sdate},#{ddate})")
	public List<tj_shop> gettjAllShop(tjinfo info);
	
	@Select("call tj_product(#{s_where},#{sdate},#{ddate})")
	public List<tj_product> gettjAllProduct(tjinfo info);
	
	@Select("call tj_all(#{s_where},#{sdate},#{ddate})")
	public List<tj_all> gettjAll(tjinfo info);
	
}
