package controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.shop;
import model.vip;
import model.viptype;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.shop_service;
import service.vip_service;
import service.viptype_service;
import utils.Jsonstatus;
import utils.autoCreate;
import utils.pagemanage;
import utils.tools;

@Controller
@RequestMapping("vip")
public class vip_controller extends Basic_controller<vip> {
	@Resource(name="vip_serviceImpl")
	vip_service service;
	
	@Resource(name="viptype_serviceImpl")
	viptype_service viptypeservice;
	
	@Resource(name="shop_serviceImpl")
	shop_service shopservice;
	
	@RequestMapping("shoplist")
	public @ResponseBody List shoplist(pagemanage info,HttpServletRequest req){
		List<shop> shoplist =  shopservice.getall(new pagemanage(false));
		return shoplist;
	}
	
	@RequestMapping("sexlist")
	public @ResponseBody String[][] sexlist(pagemanage info,HttpServletRequest req){
		return tools.sexnames;
	}
	@RequestMapping("viplevel")
	public @ResponseBody String[][] viplevel(pagemanage info,HttpServletRequest req){
		return tools.viplevel;
	}
	@RequestMapping("viptypelist")
	public @ResponseBody List viptypelist(pagemanage info,HttpServletRequest req){
		List<viptype> viptypelist = viptypeservice.getall(new pagemanage(false));
		return viptypelist;
	}
	
	@Override
	public Jsonstatus insert(HttpServletRequest req, vip b) {
		b.setCreatedate(autoCreate.Now());
		b.setUserid(1);
		return super.insert(req, b);
	}
	@Override
	public Jsonstatus update(HttpServletRequest req, vip b) {
		b.setUserid(1);
		return super.update(req, b);
	}
	@RequestMapping("project")
	public @ResponseBody List project(int id,HttpServletRequest req){
		List<viptype> viptypelist = viptypeservice.getall(new pagemanage(false));
		return viptypelist;
	}
	
}
