package controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.ordermain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.ordermain_service;
import utils.Jsonstatus;
import utils.autoCreate;

@Controller
@RequestMapping("ordermain")
public class ordermain_controller extends Basic_controller<ordermain> {
	@Resource(name="ordermain_serviceImpl")
	ordermain_service service;
	
	@Override
	public Jsonstatus insert(HttpServletRequest req, ordermain b) {
		
		switch (b.getOrdertype()) {
		case 1://充值单
			
			break;
		case 2://会员退款单
			
			//相关数据默认值
			
			break;
		case 10://项目充值单
			//设置无关数据默认值
			
			//相关数据默认值
			
			break;
		case 11://项目退款单
			//设置无关数据默认值
			
			
			//相关数据默认值
			
			break;
		case 3://采购单
			//设置无关数据默认值
			
			
			//相关数据默认值

			
			break;
		case 4://采购退货单
			//设置无关数据默认值
			
			
			//相关数据默认值
			
			break;
		case 5://销售单
			//设置无关数据默认值
			
			//相关数据默认值
			
			break;
		case 6://销售退货单
			//设置无关数据默认值
			
			//相关数据默认值
			
			break;
		case 7://移库单
			//设置无关数据默认值
			
			
			//相关数据默认值
			
			break;
		case 8://库损单
			//设置无关数据默认值
			
			
			//相关数据默认值
			
			break;
		case 9://库溢单
			//设置无关数据默认值
			
			
			//相关数据默认值
			
			break;
		default:
			break;
		}
		b.setUserid(1);
		b.setCreatedate(autoCreate.Now());
		return super.insert(req, b);
	}
}
