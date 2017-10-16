package mapper;

import java.util.List;

import model.store;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("store_Mapper")//����mapper�����ݿ⣬���ø���ǰ��bean����һ�����֣���������λ��ʹ��
public interface store_Mapper extends Basic_mapper<store> {
	
	@Select("select * from store ${where}")
	public List<store> getall(pagemanage info);
	
	@Select("select store.*,product.code productcode,product.name productname,product.status pstatus from store inner join producttype inner join product on  product.id=store.productid and producttype.id=product.producttypeid  and  store.shopid=#{shopid}")
	public List<store> getByShopId(int shopid);
	
	@Select("select  count(1)  from store ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Select("select store.* from store where store.id = #{id}")
	public store getByID(int id);
	
	@Update("update store set count=#{count},defprice=#{defprice},cbprice=#{cbprice}  where id = #{id}")
	public void update(store b);
}
