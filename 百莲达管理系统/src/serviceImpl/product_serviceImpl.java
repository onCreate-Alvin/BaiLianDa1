package serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import mapper.product_Mapper;
import model.product;

import org.springframework.stereotype.Service;

import service.product_service;
import utils.pagemanage;

@Service("product_serviceImpl")
public class product_serviceImpl  extends Basic_serviceImpl<product> implements product_service{
	@Resource(name="product_Mapper")
	product_Mapper mapper;

	public List<product> getAllandPrice(pagemanage info, int shopid) {
		return mapper.getAllandPrice(info, shopid);
	}

}
