package serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import mapper.tj_Mapper;
import model.tj_all;
import model.tj_product;
import model.tj_shop;
import model.tj_user;
import model.tj_vip;
import model.tj_vipmx;

import org.springframework.stereotype.Service;

import service.tj_service;
import utils.tjinfo;

@Service("tj_serviceImpl")
public class tj_serviceImpl  extends Basic_serviceImpl<tj_vipmx> implements tj_service{
	@Resource(name="tj_Mapper")
	tj_Mapper mapper;
	
	//获取会员余额明细统计表
	public List<tj_vipmx> gettjByVipId(int id) {
		// TODO Auto-generated method stub
		return mapper.gettjByVipId(id);
	}
	
	//会员统计表
	public List<tj_vip> gettjAllVip(tjinfo info) {
		return mapper.gettjAllVip(info);
	}

	public List<tj_user> gettjAllUser(tjinfo info) {
		// TODO Auto-generated method stub
		return mapper.gettjAllUser(info);
	}

	public List<tj_shop> gettjAllShop(tjinfo info) {
		// TODO Auto-generated method stub
		return mapper.gettjAllShop(info);
	}

	public List<tj_product> gettjAllProduct(tjinfo info) {
		// TODO Auto-generated method stub
		return mapper.gettjAllProduct(info);
	}

	public List<tj_all> gettjAll(tjinfo info) {
		// TODO Auto-generated method stub
		return mapper.gettjAll(info);
	}




}
