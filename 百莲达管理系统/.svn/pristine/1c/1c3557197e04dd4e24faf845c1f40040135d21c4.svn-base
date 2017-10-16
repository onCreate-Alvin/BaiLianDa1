package serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import mapper.store_Mapper;
import model.store;

import org.springframework.stereotype.Service;

import service.store_service;

@Service("store_serviceImpl")
public class store_serviceImpl  extends Basic_serviceImpl<store> implements store_service{
	@Resource(name="store_Mapper")
	store_Mapper mapper;

	public List<store> getByShopId(int shopid) {
		return mapper.getByShopId(shopid);
	}




}
