package controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.checkmain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.checkmain_service;
import utils.Jsonstatus;
import utils.autoCreate;

@Controller
@RequestMapping("checkmain")
public class checkmain_controller extends Basic_controller<checkmain> {
	@Resource(name="checkmain_serviceImpl")
	checkmain_service service;
	
	@Override
	public Jsonstatus insert(HttpServletRequest req, checkmain b) {
		b.setStatus(0);
		b.setFexp("д╛хо");
		return super.insert(req, b);
	}
}
