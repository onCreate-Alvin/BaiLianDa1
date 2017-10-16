package controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.client;
import model.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.shop_service;
import utils.Jsonstatus;
import utils.autoCreate;

@Controller
@RequestMapping("shop")
public class shop_controller extends Basic_controller<shop> {
	@Resource(name="shop_serviceImpl")
	shop_service service;
	
	@Override
	public Jsonstatus insert(HttpServletRequest req, shop b) {
		b.setCreatedate(autoCreate.Now());
		b.setUserid(1);
		return super.insert(req, b);
	}
	@Override
	public Jsonstatus update(HttpServletRequest req, shop b) {
		b.setUserid(1);
		return super.update(req, b);
	}
}
