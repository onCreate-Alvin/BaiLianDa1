package controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.checkdetail;
import model.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.checkdetail_service;
import service.checkmain_service;
import service.product_service;
import utils.Jsonstatus;
import utils.pagemanage;

@Controller
@RequestMapping("checkdetail")
public class checkdetail_controller extends Basic_controller<checkdetail> {
	@Resource(name="checkdetail_serviceImpl")
	checkdetail_service service;
	
	@Resource(name="product_serviceImpl")
	product_service pservice;
	
	@Resource(name="checkmain_serviceImpl")
	checkmain_service checkmainpservice;
	
	@RequestMapping("zjm")
	public @ResponseBody checkdetail zjm(checkdetail v,HttpServletRequest req){
		List<product> list =  pservice.getall(new pagemanage(" where product.id ="+v.getProductid(),false));
		product a = list.get(0);
		v.setPcode(a.getCode());
		v.setPname(a.getName());
		v.setProductid(a.getId());
		v.setPstatus(a.getStatus());
		return v;
	}
	
	@RequestMapping("insert1")
	public Jsonstatus insert1(HttpServletRequest req, checkdetail b) {
		
		b.setCheckid(checkmainpservice.getlastID());
		service.insert(b);
		return new Jsonstatus(1);
	}
	
}
