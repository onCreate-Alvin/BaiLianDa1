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
		case 1://��ֵ��
			
			break;
		case 2://��Ա�˿
			
			//�������Ĭ��ֵ
			
			break;
		case 10://��Ŀ��ֵ��
			//�����޹�����Ĭ��ֵ
			
			//�������Ĭ��ֵ
			
			break;
		case 11://��Ŀ�˿
			//�����޹�����Ĭ��ֵ
			
			
			//�������Ĭ��ֵ
			
			break;
		case 3://�ɹ���
			//�����޹�����Ĭ��ֵ
			
			
			//�������Ĭ��ֵ

			
			break;
		case 4://�ɹ��˻���
			//�����޹�����Ĭ��ֵ
			
			
			//�������Ĭ��ֵ
			
			break;
		case 5://���۵�
			//�����޹�����Ĭ��ֵ
			
			//�������Ĭ��ֵ
			
			break;
		case 6://�����˻���
			//�����޹�����Ĭ��ֵ
			
			//�������Ĭ��ֵ
			
			break;
		case 7://�ƿⵥ
			//�����޹�����Ĭ��ֵ
			
			
			//�������Ĭ��ֵ
			
			break;
		case 8://����
			//�����޹�����Ĭ��ֵ
			
			
			//�������Ĭ��ֵ
			
			break;
		case 9://���絥
			//�����޹�����Ĭ��ֵ
			
			
			//�������Ĭ��ֵ
			
			break;
		default:
			break;
		}
		b.setUserid(1);
		b.setCreatedate(autoCreate.Now());
		return super.insert(req, b);
	}
}
