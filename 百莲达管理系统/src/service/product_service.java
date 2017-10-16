package service;

import java.util.List;

import utils.pagemanage;
import model.product;

public interface product_service extends BasicService<product>{
	public List<product> getAllandPrice(pagemanage info,int shopid);
}
