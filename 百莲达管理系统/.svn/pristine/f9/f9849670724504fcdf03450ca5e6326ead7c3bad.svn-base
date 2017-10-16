package controller;


import java.util.List;

import javax.annotation.Resource;

import model.tj_vipmx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.tj_service;
import utils.tjinfo;

@Controller
@RequestMapping("tj")
public class tj_controller extends Basic_controller<tj_vipmx> {
	@Resource(name="tj_serviceImpl")
	tj_service service;
	@RequestMapping("vipmx")
	public @ResponseBody List getvipmx(int id){
		return service.gettjByVipId(id);
	}
	@RequestMapping("vip")
	public @ResponseBody List gettjAllvip(tjinfo info){
		info.setS_where("id>0");
		return service.gettjAllVip(info);
	}
	@RequestMapping("user")
	public @ResponseBody List gettjAllUser(tjinfo info){
		info.setS_where("id>0");
		return service.gettjAllUser(info);
	}
	@RequestMapping("shop")
	public @ResponseBody List gettjAllShop(tjinfo info){
		info.setS_where("id>0");
		return service.gettjAllShop(info);
	}
	@RequestMapping("product")
	public @ResponseBody List gettjAllProduct(tjinfo info){
		info.setS_where("id>0");
		return service.gettjAllProduct(info);
	}
	@RequestMapping("all")
	public @ResponseBody List gettjAllAll(tjinfo info){
		info.setS_where("ordertype>0");
		return service.gettjAll(info);
	}
	
}
