package serviceImpl;

import javax.annotation.Resource;

import mapper.viptype_Mapper;
import model.viptype;

import org.springframework.stereotype.Service;

import service.viptype_service;

@Service("viptype_serviceImpl")
public class viptype_serviceImpl  extends Basic_serviceImpl<viptype> implements viptype_service{
	@Resource(name="viptype_Mapper")
	viptype_Mapper mapper;

}
