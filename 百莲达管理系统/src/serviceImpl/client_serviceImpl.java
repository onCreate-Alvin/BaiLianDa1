package serviceImpl;

import javax.annotation.Resource;

import mapper.client_Mapper;
import model.client;

import org.springframework.stereotype.Service;

import service.client_service;

@Service("client_serviceImpl")
public class client_serviceImpl  extends Basic_serviceImpl<client> implements client_service{
	@Resource(name="client_Mapper")
	client_Mapper mapper;
}
