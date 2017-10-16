package serviceImpl;

import javax.annotation.Resource;

import mapper.user_Mapper;
import model.user;

import org.springframework.stereotype.Service;

import service.user_service;

@Service("user_serviceImpl")
public class user_serviceImpl  extends Basic_serviceImpl<user> implements user_service{
	@Resource(name="user_Mapper")
	user_Mapper mapper;

	public user getByCode(String code) {
		// TODO Auto-generated method stub
		return mapper.getByCode(code);
	}

	public void updatepass(user u) {
		mapper.updatepass(u);
	}




}
