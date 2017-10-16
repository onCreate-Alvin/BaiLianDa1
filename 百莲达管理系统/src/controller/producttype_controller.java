package controller;


import javax.annotation.Resource;

import model.producttype;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.producttype_service;

@Controller
@RequestMapping("producttype")
public class producttype_controller extends Basic_controller<producttype> {
	@Resource(name="producttype_serviceImpl")
	producttype_service service;
}
