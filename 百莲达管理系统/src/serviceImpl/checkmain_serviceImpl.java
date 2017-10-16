package serviceImpl;

import javax.annotation.Resource;

import mapper.checkmain_Mapper;
import model.checkmain;

import org.springframework.stereotype.Service;

import service.checkmain_service;

@Service("checkmain_serviceImpl")
public class checkmain_serviceImpl  extends Basic_serviceImpl<checkmain> implements checkmain_service{
	@Resource(name="checkmain_Mapper")
	checkmain_Mapper mapper;

	public int getlastID() {
		
		return mapper.getlastID();
	}
}
