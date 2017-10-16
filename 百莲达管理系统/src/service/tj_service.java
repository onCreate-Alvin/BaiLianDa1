package service;

import java.util.List;

import utils.tjinfo;

import model.tj_all;
import model.tj_product;
import model.tj_shop;
import model.tj_user;
import model.tj_vip;
import model.tj_vipmx;

public interface tj_service extends BasicService<tj_vipmx>{
	public List<tj_vipmx> gettjByVipId(int id);
	public List<tj_vip> gettjAllVip(tjinfo info);
	public List<tj_user> gettjAllUser(tjinfo info);
	public List<tj_shop> gettjAllShop(tjinfo info);
	public List<tj_product> gettjAllProduct(tjinfo info);
	public List<tj_all> gettjAll(tjinfo info);
}
