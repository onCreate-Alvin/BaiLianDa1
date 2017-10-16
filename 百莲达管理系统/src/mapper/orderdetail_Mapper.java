package mapper;

import java.util.List;

import model.orderdetail;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("orderdetail_Mapper")//����mapper�����ݿ⣬���ø���ǰ��bean����һ�����֣���������λ��ʹ��
public interface orderdetail_Mapper extends Basic_mapper<orderdetail> {
	
	@Select("select * from orderdetail ${where}   ${order} ${limit}")
	public List<orderdetail> getall(pagemanage info);
	
	@Select("select  count(1)  from orderdetail ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from orderdetail where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into orderdetail(orderid,productid,count,price,amount,point,fexp,cbprice) values(#{orderid},#{productid},#{count},#{price},#{amount},#{point},#{fexp},#{cbprice})")
	public void insert(orderdetail b);
	
	@Select("select orderdetail.* from orderdetail where orderdetail.id = #{id}")
	public orderdetail getByID(int id);
	

}
