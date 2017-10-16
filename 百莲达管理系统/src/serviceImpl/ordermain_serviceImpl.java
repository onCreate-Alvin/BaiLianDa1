package serviceImpl;

import javax.annotation.Resource;

import mapper.ordermain_Mapper;
import model.ordermain;

import org.springframework.stereotype.Service;

import service.ordermain_service;

@Service("ordermain_serviceImpl")
public class ordermain_serviceImpl  extends Basic_serviceImpl<ordermain> implements ordermain_service{
	@Resource(name="ordermain_Mapper")
	ordermain_Mapper mapper;

	public int getlastID() {
		
		return mapper.getlastID();
	}




}
