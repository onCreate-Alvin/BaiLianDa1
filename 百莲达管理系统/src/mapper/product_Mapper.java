package mapper;

import java.util.List;

import model.product;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("product_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface product_Mapper extends Basic_mapper<product> {
	
	@Select("select product.*,producttype.*,user.*,producttype.name typename,user.name u_name from  product inner join producttype on product.producttypeid=producttype.id  inner join user on product.userid=user.id  ${where}  ${order} ${limit}")
	public List<product> getall(pagemanage info);
	
	@Select("select product.*,producttype.*,user.*,store.* from  product inner join producttype on product.producttypeid=producttype.id  inner join user on product.userid=user.id inner join store on product.id=store.productid and store.shopid=#{shopid} ${where}")
	public List<product> getAllandPrice(pagemanage info,int shopid);
	
	@Select("select  count(1)  from product ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from product where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into product(code,zjm,name,mode,peso,unit,producttypeid,defaultprice,defaultpoint,status,createdate,userid,fexp) values(#{code},#{zjm},#{name},#{mode},#{peso},#{unit},#{producttypeid},#{defaultprice},#{defaultpoint},#{status},#{createdate},#{userid},#{fexp})")
	public void insert(product b);
	
	@Select("select product.* from product where product.id = #{id}")
	public product getByID(int id);
	
	@Update("update product set code=#{code},zjm=#{zjm},name=#{name},mode=#{mode},peso=#{peso},unit=#{unit},producttypeid=#{producttypeid},defaultprice=#{defaultprice},defaultpoint=#{defaultpoint},status=#{status},userid=#{userid},fexp=#{fexp}  where id = #{id}")
	public void update(product b);
}
