package controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.client;
import model.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.client_service;
import utils.Jsonstatus;
import utils.MD5Util;
import utils.autoCreate;
import utils.pagemanage;
import utils.tools;

@Controller
@RequestMapping("client")
public class client_controller extends Basic_controller<client> {
	@Resource(name="client_serviceImpl")
	client_service service;
	
	
	@Override
	public Jsonstatus insert(HttpServletRequest req, client b) {
		b.setCreatedate(autoCreate.Now());
		b.setUserid(1);
		return super.insert(req, b);
	}
	@Override
	public Jsonstatus update(HttpServletRequest req, client b) {
		b.setUserid(1);
		return super.update(req, b);
	}
}
