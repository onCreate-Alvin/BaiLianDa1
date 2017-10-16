package mapper;

import java.util.List;

import model.checkdetail;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import utils.batchids;
import utils.pagemanage;

@Repository("checkdetail_Mapper")//描述mapper，数据库，作用给当前的bean加入一个名字，方便其他位置使用
public interface checkdetail_Mapper extends Basic_mapper<checkdetail> {
	
	@Select("select checkdetail.*,product.name pname,product.code pcode,product.status pstauts from checkdetail left join on checkdetail.productid = product.id  ${where}   ${order} ${limit}")
	public List<checkdetail> getall(pagemanage info);
	
	@Select("select  count(1)  from checkdetail ${where}")
	public Long getAllSize(pagemanage info) ;
	
	@Delete("delete from checkdetail where id in (${ids})")  
	public void delete(batchids ids);
	
	@Insert("insert into checkdetail(checkid,productid,count,fexp) values(#{checkid},#{productid},#{count},#{fexp})")
	public void insert(checkdetail b);
	
	@Select("select checkdetail.* from checkdetail where checkdetail.id = #{id}")
	public checkdetail getByID(int id);
	

}
