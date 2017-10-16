package controller;


import javax.annotation.Resource;

import model.viptype;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.viptype_service;

@Controller
@RequestMapping("viptype")
public class viptype_controller extends Basic_controller<viptype> {
	@Resource(name="viptype_serviceImpl")
	viptype_service service;
}
