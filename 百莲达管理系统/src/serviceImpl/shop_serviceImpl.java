package serviceImpl;

import javax.annotation.Resource;

import mapper.shop_Mapper;
import model.shop;

import org.springframework.stereotype.Service;

import service.shop_service;

@Service("shop_serviceImpl")
public class shop_serviceImpl  extends Basic_serviceImpl<shop> implements shop_service{
	@Resource(name="shop_Mapper")
	shop_Mapper mapper;




}
