package controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.orderdetail;
import model.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.orderdetail_service;
import service.ordermain_service;
import service.product_service;
import utils.Jsonstatus;
import utils.pagemanage;

@Controller
@RequestMapping("orderdetail")
public class orderdetail_controller extends Basic_controller<orderdetail> {
	@Resource(name="orderdetail_serviceImpl")
	orderdetail_service service;
	
	@Resource(name="product_serviceImpl")
	product_service pservice;
	
	@Resource(name="ordermain_serviceImpl")
	ordermain_service ordermainpservice;
	
	@RequestMapping("zjm")
	public @ResponseBody orderdetail zjm(String productid,double detailcount,double detailprice,HttpServletRequest req){
		List<product> list =  pservice.getall(new pagemanage(" where product.id ="+productid,false));
		orderdetail v = new orderdetail();
		product a = list.get(0);
		v.setProductid(a.getId());
		v.setPname(a.getName());
		v.setPcode(a.getCode());
		v.setAmount(detailprice*detailcount);
		v.setCount(detailcount);
		v.setPrice(detailprice);
		v.setPoint(0);
		v.setFexp("д╛хо ");
		return v;
	}
	
	@RequestMapping("insert1")
	public Jsonstatus insert1(HttpServletRequest req, orderdetail b) {
		b.setOrderid(ordermainpservice.getlastID());
		service.insert(b);
		return new Jsonstatus(1);
	}
	
}
