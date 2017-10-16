package situ.bld.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;


import situ.bld.controls.ColumnInfo;

public class ListManager {

	private static HashMap<String,ArrayList<Object[]> > ColumnList=new HashMap<String, ArrayList<Object[]>>();
	private static Properties txts=new Properties();//user.id  用户id
	private static void SetTxt(){
		
		String path=System.getProperty("user.dir")+"\\Properties\\alltxt.Properties";
		File f = new File(path);
		if(f.exists()){
			try {
				txts.load(new FileInputStream(f));
			} catch (Exception e) {
			}
		}
		else{
		txts.put("projectstore.count", "剩余数量");
		txts.put("checkmain.checkcode", "盘点编号");
		txts.put("checkmain.checkname", "盘点名称");
		txts.put("checkmain.checkdate", "盘点日期");
		txts.put("checkmain.fexp", "盘点备注");
		txts.put("checkmain.status", "盘点状态");
		txts.put("checkdetail.count", "盘点数量");
		txts.put("checkdetail.fexp", "盘点商品备注");
		txts.put("client.code", "供应商编号");
		txts.put("client.name", "供应商名称");
		txts.put("client.addr", "供应商地址");
		txts.put("client.tel", "供应商电话");
		txts.put("client.telmov", "供应商手机");
		txts.put("client.lxr", "供应商联系人");
		txts.put("client.bank", "供应商账号");
		txts.put("client.createdate", "供应商创建日期");
		txts.put("client.fexp", "供应商备注");
		txts.put("ordermain.ordercode","单据编号");
		txts.put("ordermain.ordertype","单据类型");
		txts.put("ordermain.orderdate","单据日期");
		txts.put("ordermain.createdate","录入日期");
		txts.put("ordermain.vipamount","会员卡支付");
		txts.put("ordermain.point","总积分");
		txts.put("ordermain.amount","总金额");
		txts.put("ordermain.status","单据状态");
		txts.put("ordermain.fexp","单据备注");
		txts.put("orderdetail.count","数量");
		txts.put("orderdetail.price","售价");
		txts.put("orderdetail.amount","金额小计");
		txts.put("orderdetail.cbprice","成本单价");
		txts.put("orderdetail.fexp","明细备注");
		txts.put("orderdetail.point","积分小计");
		
		
		txts.put("product.code","商品编号");
		txts.put("product.zjm","助记码");
		txts.put("product.name","商品名称");
		txts.put("product.peso","商品重量");
		txts.put("product.mode","商品型号");
		txts.put("product.unit","计量单位");
		txts.put("product.defaultprice","商品默认价格");
		txts.put("product.defaultpoint","商品默认积分");
		txts.put("product.status","商品状态");
		txts.put("product.createdate","商品创建日期");
		txts.put("product.fexp","商品备注");
		txts.put("producttype.name","商品类型名称");
		txts.put("producttype.fexp","商品类型备注");
		txts.put("shop.code","分店编号");
		txts.put("shop.name","分店名字");
		txts.put("shop.addr","分店地址");
		txts.put("shop.tel","分店电话");
		txts.put("shop.telmov","分店手机");
		txts.put("shop.createdate","分店创建日期");
		txts.put("shop.fexp","分店备注");
		txts.put("shop.s_code","目的分店编号");
		txts.put("shop.s_name","目的分店名字");
		txts.put("shop.s_addr","目的分店地址");
		txts.put("shop.s_tel","目的分店电话");
		txts.put("shop.s_telmov","目的分店手机");
		txts.put("shop.s_createdate","目的分店创建日期");
		txts.put("shop.s_fexp","目的分店备注");
		txts.put("store.count","库存数量");
		txts.put("store.defprice","预置价格");
		txts.put("store.cbprice","库存成本价格");
		txts.put("user.code","操作员编号");
		txts.put("user.name","操作员名称");
		txts.put("user.sex","操作员性别");
		txts.put("user.addr","操作员地址");
		txts.put("user.tel","操作员电话");
		txts.put("user.telmov","操作员手机");
		txts.put("user.birthdate","操作员出生日期");
		txts.put("user.ccode","操作员证件号");
		txts.put("user.status","操作员状态");
		txts.put("user.createdate","操作员创建日期");
		txts.put("user.enterdate","操作员入职日期");
		txts.put("user.exitdate","操作员离职日期");
		txts.put("user.fright","操作员权限");
		txts.put("user.fexp","操作员备注");
		txts.put("user.u_name","创建人姓名");
		txts.put("user.u_sex","创建人性别");
		txts.put("user.u_code","创建人编号");
		txts.put("user.u_tel","创建人电话");
		txts.put("user.u_telmov","创建人手机");
		txts.put("vip.code","会员编号");
		txts.put("vip.name","会员名称");
		txts.put("vip.sex","会员性别");
		txts.put("vip.addr","会员地址");
		txts.put("vip.tel","会员电话");
		txts.put("vip.telmov","会员手机");
		txts.put("vip.birthdate","会员出生日期");
		txts.put("vip.ccode","会员证件号");
		txts.put("vip.amount","会员余额");
		txts.put("vip.point","会员积分");
		txts.put("vip.status","会员状态");
		txts.put("vip.createdate","会员创建日期");
		txts.put("vip.jsr","介绍人");
		txts.put("vip.fexp","会员备注");
		txts.put("viptype.name","会员类型名称");
		txts.put("viptype.fexp","会员类型备注");
		
		txts.put("tmp_mxtj.ordercode","单据号");
		txts.put("tmp_mxtj.ordertype","单据类型");
		txts.put("tmp_mxtj.orderdate","日期");
		txts.put("tmp_mxtj.shopname","分店");
		txts.put("tmp_mxtj.username","创建人");
		txts.put("tmp_mxtj.amount","单据金额");
		txts.put("tmp_mxtj.inje","增加");
		txts.put("tmp_mxtj.outje","减少");
		txts.put("tmp_mxtj.je","余额");
		txts.put("tmp_mxtj.inpoint","增加");
		txts.put("tmp_mxtj.outpoint","减少");
		txts.put("tmp_mxtj.point","积分");
		
		txts.put("tmp_vip_tj.vipname","会员名称");
		txts.put("tmp_vip_tj.je1","充值金额");
		txts.put("tmp_vip_tj.point1","充值积分");
		txts.put("tmp_vip_tj.je11","项目充值金额");
		txts.put("tmp_vip_tj.point11","项目充值积分");
		txts.put("tmp_vip_tj.je12","项目取款金额");
		txts.put("tmp_vip_tj.point12","项目取款积分");
		txts.put("tmp_vip_tj.je2","取款金额");
		txts.put("tmp_vip_tj.point2","取款积分");
		txts.put("tmp_vip_tj.je3","销售金额");
		txts.put("tmp_vip_tj.point3","销售积分");
		txts.put("tmp_vip_tj.je4","退货金额");
		txts.put("tmp_vip_tj.point4","退货积分");
		
		txts.put("tmp_user_tj.username","操作员名称");
		txts.put("tmp_user_tj.je1","充值金额");
		txts.put("tmp_user_tj.point1","充值积分");
		txts.put("tmp_user_tj.count1","充值次数");
		
		txts.put("tmp_user_tj.je11","项目充值金额");
		txts.put("tmp_user_tj.point11","项目充值积分");
		txts.put("tmp_user_tj.count11","项目充值次数");
		txts.put("tmp_user_tj.je12","项目充值金额");
		txts.put("tmp_user_tj.point12","项目充值积分");
		txts.put("tmp_user_tj.count12","项目充值次数");
		
		txts.put("tmp_user_tj.je2","取款金额");
		txts.put("tmp_user_tj.point2","取款积分");
		txts.put("tmp_user_tj.count2","取款次数");
		txts.put("tmp_user_tj.je3","采购金额");
		txts.put("tmp_user_tj.count3","进货次数");
		txts.put("tmp_user_tj.je4","采购退货金额");
		txts.put("tmp_user_tj.count4","采购退货次数");
		txts.put("tmp_user_tj.je5","销售金额");
		txts.put("tmp_user_tj.point5","销售积分");
		txts.put("tmp_user_tj.count5","销售次数");
		txts.put("tmp_user_tj.xj5","销售现金");
		txts.put("tmp_user_tj.je6","销售退货金额");
		txts.put("tmp_user_tj.point6","销售退货积分");
		txts.put("tmp_user_tj.count6","销售退货次数");
		txts.put("tmp_user_tj.xj6","退货现金");
		txts.put("tmp_user_tj.count7","移库次数");
		txts.put("tmp_user_tj.count8","库损次数");
		txts.put("tmp_user_tj.count9","库溢次数");
		
		txts.put("tmp_shop_tj.shopname","分店名称");
		txts.put("tmp_shop_tj.storeamount","库存金额");
		txts.put("tmp_shop_tj.inamount","采购金额");
		txts.put("tmp_shop_tj.movinamount","移入金额");
		txts.put("tmp_shop_tj.movoutamount","移出金额");
		txts.put("tmp_shop_tj.saleamount","销售金额");
		txts.put("tmp_shop_tj.xj1","销售现金");
		txts.put("tmp_shop_tj.saletamount","销售退货金额");
		txts.put("tmp_shop_tj.xj2","退货现金");
		txts.put("tmp_shop_tj.samount","库损金额");
		txts.put("tmp_shop_tj.yamount","库溢金额");
		txts.put("tmp_shop_tj.saleallamount","销售利润");
		txts.put("tmp_shop_tj.allamount","总利润");
		
		txts.put("tmp_product_tj.productname","商品名称");
		txts.put("tmp_product_tj.incount","采购数量");
		txts.put("tmp_product_tj.inamount","采购金额");
		txts.put("tmp_product_tj.intcount","采购退货数量");
		txts.put("tmp_product_tj.intamount","采购退货金额");
		txts.put("tmp_product_tj.outcount","销售数量");
		txts.put("tmp_product_tj.outcount1","项目销售数量");
		txts.put("tmp_product_tj.outamount","销售金额");
		txts.put("tmp_product_tj.outtcount","销售退货数量");
		txts.put("tmp_product_tj.outtcount1","项目退货数量");
		txts.put("tmp_product_tj.outtamount","销售退货金额");
		txts.put("tmp_product_tj.movcount","移库数量");
		txts.put("tmp_product_tj.movamount","移库金额");
		txts.put("tmp_product_tj.scount","库损数量");
		txts.put("tmp_product_tj.samount","库损金额");
		txts.put("tmp_product_tj.ycount","库溢数量");
		txts.put("tmp_product_tj.yamount","库溢金额");
		
	
		txts.put("tmp_all_tj.amount1","充值金额");
		txts.put("tmp_all_tj.point1","充值积分");
		txts.put("tmp_all_tj.amount2","取款金额");
		txts.put("tmp_all_tj.point2","取款积分");
		txts.put("tmp_all_tj.amount3","采购金额");
		txts.put("tmp_all_tj.count3","采购数量");
		txts.put("tmp_all_tj.amount4","采购退货金额");
		txts.put("tmp_all_tj.count4","采购退货数量");
		txts.put("tmp_all_tj.amount5","销售金额");
		txts.put("tmp_all_tj.point5","销售积分");
		txts.put("tmp_all_tj.count5","销售数量");
		txts.put("tmp_all_tj.amount6","销售退货金额");
		txts.put("tmp_all_tj.point6","销售退货积分");
		txts.put("tmp_all_tj.count6","销售退货数量");
		txts.put("tmp_all_tj.amount7","移库金额");
		txts.put("tmp_all_tj.count7","移库数量");
		txts.put("tmp_all_tj.amount8","库损金额");
		txts.put("tmp_all_tj.count8","库损数量");
		txts.put("tmp_all_tj.amount9","库溢金额");
		txts.put("tmp_all_tj.count9","库溢数量");
		try {
			txts.store(new FileOutputStream(path), "数据表列中文");
		} catch (Exception e) {
		}
		}
	}
	static{
	SetTxt();
	ArrayList<Object[]> project=new ArrayList<Object[]>();
	project.add(new Object[]{"product.code",0});
	project.add(new Object[]{"product.name",0});
	project.add(new Object[]{"orderdetail.count",0});
	project.add(new Object[]{"orderdetail.amount",0});
	project.add(new Object[]{"orderdetail.point",0});
	project.add(new Object[]{"orderdetail.fexp",0});
	project.add(new Object[]{"orderdetail.id",1});
	project.add(new Object[]{"orderdetail.orderid",1});
	project.add(new Object[]{"orderdetail.price",1});
	project.add(new Object[]{"orderdetail.srctype",1});
	project.add(new Object[]{"orderdetail.cbprice",1});
	project.add(new Object[]{"product.id",1});
	ColumnList.put("projectdetail", project);	
	
	
		ArrayList<Object[]> check=new ArrayList<Object[]>();
		check.add(new Object[]{"checkmain.id",1});
		check.add(new Object[]{"checkmain.checkcode",0});
		check.add(new Object[]{"checkmain.checkname",0,200});
		check.add(new Object[]{"checkmain.checkdate",0,0,"yyyy-MM-dd"});
		check.add(new Object[]{"shop.name",0});
		check.add(new Object[]{"shop.code",2});
		check.add(new Object[]{"shop.addr",2,200});
		check.add(new Object[]{"shop.tel",2});
		check.add(new Object[]{"shop.telmov",2});
		check.add(new Object[]{"shop.fexp",2,200});
		check.add(new Object[]{"shop.createdate",2,0,"yyyy-MM-dd"});
		check.add(new Object[]{"checkmain.status",0});
		check.add(new Object[]{"checkmain.fexp",0,200});
		ColumnList.put("check", check);	
		
		ArrayList<Object[]> client=new ArrayList<Object[]>();
		client.add(new Object[]{"client.id",1});
		client.add(new Object[]{"client.code",0});
		client.add(new Object[]{"client.name",0,200});
		client.add(new Object[]{"client.addr",2,200});
		client.add(new Object[]{"client.tel",0});
		client.add(new Object[]{"client.telmov",0});
		client.add(new Object[]{"client.lxr",2});
		client.add(new Object[]{"client.bank",2});
		client.add(new Object[]{"client.createdate",2});
		client.add(new Object[]{"client.userid",1});
		client.add(new Object[]{"user.code",2});
		client.add(new Object[]{"user.name",0});
		client.add(new Object[]{"user.sex",2});
		client.add(new Object[]{"user.addr",2,200});
		client.add(new Object[]{"user.tel",2});
		client.add(new Object[]{"user.telmov",2});
		client.add(new Object[]{"user.birthdate",2,0,"yyyy-MM-dd"});
		client.add(new Object[]{"user.ccode",2});
		client.add(new Object[]{"user.status",2});
		client.add(new Object[]{"user.createdate",2,0,"yyyy-MM-dd"});
		client.add(new Object[]{"user.enterdate",2,0,"yyyy-MM-dd"});
		client.add(new Object[]{"user.exitdate",2,0,"yyyy-MM-dd"});
		client.add(new Object[]{"user.fexp",2});
		client.add(new Object[]{"client.fexp",0,200});
		ColumnList.put("client", client);
//------------------order------------------------
		
		ArrayList<Object[]>  order=new ArrayList<Object[]>();
		order.add(new Object[]{"ordermain.id",1});
		order.add(new Object[]{"ordermain.ordercode",0});
		order.add(new Object[]{"ordermain.ordertype",0});
		order.add(new Object[]{"ordermain.orderdate",0,0,"yyyy-MM-dd"});
		order.add(new Object[]{"ordermain.createdate",2});
		order.add(new Object[]{"ordermain.amount",0});
		order.add(new Object[]{"ordermain.vipamount",0});
		order.add(new Object[]{"ordermain.point",0});
		order.add(new Object[]{"client.code",2});
		order.add(new Object[]{"client.name",0});
		order.add(new Object[]{"client.addr",2,200});
		order.add(new Object[]{"client.tel",2});
		order.add(new Object[]{"client.telmov",2});
		order.add(new Object[]{"client.lxr",2});
		order.add(new Object[]{"client.bank",2});
		order.add(new Object[]{"client.createdate",2});
		order.add(new Object[]{"client.fexp",2,200});
		order.add(new Object[]{"vip.code",2});
		order.add(new Object[]{"vip.name",0});
		order.add(new Object[]{"vip.sex",2});
		order.add(new Object[]{"vip.addr",2,200});
		order.add(new Object[]{"vip.tel",2});
		order.add(new Object[]{"vip.telmov",2});
		order.add(new Object[]{"vip.birthdate",2,0,"yyyy-MM-dd"});
		order.add(new Object[]{"vip.ccode",2});
		order.add(new Object[]{"vip.amount",2});
		order.add(new Object[]{"vip.point",2});
		order.add(new Object[]{"vip.status",2});
		order.add(new Object[]{"vip.createdate",2,0,"yyyy-MM-dd"});
		order.add(new Object[]{"vip.jsr",2});
		order.add(new Object[]{"vip.fexp",2,200});
		order.add(new Object[]{"shop.code",2});
		order.add(new Object[]{"shop.name",0});
		order.add(new Object[]{"shop.addr",2,200});
		order.add(new Object[]{"shop.tel",2});
		order.add(new Object[]{"shop.telmov",2});
		order.add(new Object[]{"shop.fexp",2,200});
		order.add(new Object[]{"shop.createdate",2});
		order.add(new Object[]{"shop.s_code",2});
		order.add(new Object[]{"shop.s_name",0});
		order.add(new Object[]{"shop.s_addr",2,200});
		order.add(new Object[]{"shop.s_tel",2});
		order.add(new Object[]{"shop.s_telmov",2});
		order.add(new Object[]{"shop.s_fexp",2,200});
		order.add(new Object[]{"shop.s_createdate",2,0,"yyyy-MM-dd"});
		client.add(new Object[]{"user.code",2});
		client.add(new Object[]{"user.name",0});
		client.add(new Object[]{"user.sex",2});
		client.add(new Object[]{"user.addr",2,200});
		client.add(new Object[]{"user.tel",2});
		client.add(new Object[]{"user.telmov",2});
		client.add(new Object[]{"user.birthdate",2,0,"yyyy-MM-dd"});
		client.add(new Object[]{"user.ccode",2});
		client.add(new Object[]{"user.status",2});
		client.add(new Object[]{"user.createdate",2});
		client.add(new Object[]{"user.enterdate",2});
		client.add(new Object[]{"user.exitdate",2});
		client.add(new Object[]{"user.fexp",2});
		order.add(new Object[]{"ordermain.status",0});
		order.add(new Object[]{"ordermain.fexp",0});
		order.add(new Object[]{"ordermain.vipid",1});
		order.add(new Object[]{"ordermain.shopid",1});
		order.add(new Object[]{"ordermain.userid",1});
		order.add(new Object[]{"ordermain.clientid",1});
		order.add(new Object[]{"ordermain.destshopid",1});
		ColumnList.put("order",order);
		
		ArrayList<Object[]>  orderdetail=new ArrayList<Object[]>();
		orderdetail.add(new Object[]{"product.code",0});
		orderdetail.add(new Object[]{"product.name",0});
		orderdetail.add(new Object[]{"orderdetail.count",0});
		orderdetail.add(new Object[]{"orderdetail.price",0});
		orderdetail.add(new Object[]{"orderdetail.amount",0});
		orderdetail.add(new Object[]{"orderdetail.fexp",0});
		orderdetail.add(new Object[]{"orderdetail.id",1});
		orderdetail.add(new Object[]{"orderdetail.orderid",1});
		orderdetail.add(new Object[]{"orderdetail.srctype",1});
		orderdetail.add(new Object[]{"product.id",1});
		orderdetail.add(new Object[]{"orderdetail.cbprice",1});
		ColumnList.put("orderdetail", orderdetail);
		ArrayList<Object[]>  orderdetail1=(ArrayList<Object[]>) orderdetail.clone();
		orderdetail1.remove(4);
		orderdetail1.remove(3);
		ColumnList.put("orderdetail_mov", orderdetail1);
		ArrayList<Object[]>  orderdetail2=(ArrayList<Object[]>) orderdetail.clone();
		orderdetail2.add(5,new Object[]{"orderdetail.point",0});
		ColumnList.put("orderdetail_xs", orderdetail2);
		
		ArrayList<Object[]>  product=new ArrayList<Object[]>();
		product.add(new Object[]{"product.id",1});
		product.add(new Object[]{"product.code",0});
		product.add(new Object[]{"product.zjm",2});
		product.add(new Object[]{"product.name",0,200});
		product.add(new Object[]{"product.peso",2});
		product.add(new Object[]{"product.mode",0});
		product.add(new Object[]{"product.unit",2});
		product.add(new Object[]{"product.producttypeid",1});
		product.add(new Object[]{"product.defaultprice",2});
		product.add(new Object[]{"product.defaultpoint",2});
		product.add(new Object[]{"product.status",0});
		product.add(new Object[]{"product.createdate",2});
		product.add(new Object[]{"producttype.name",0});
		product.add(new Object[]{"producttype.fexp",2,200});
		product.add(new Object[]{"product.userid",1});
		product.add(new Object[]{"user.code",2});
		product.add(new Object[]{"user.name",0});
		product.add(new Object[]{"user.sex",2});
		product.add(new Object[]{"user.addr",2,200});
		product.add(new Object[]{"user.tel",2});
		product.add(new Object[]{"user.telmov",2});
		product.add(new Object[]{"user.birthdate",2,0,"yyyy-MM-dd"});
		product.add(new Object[]{"user.ccode",2});
		product.add(new Object[]{"user.status",2});
		product.add(new Object[]{"user.createdate",2});
		product.add(new Object[]{"user.enterdate",2});
		product.add(new Object[]{"user.exitdate",2});
		product.add(new Object[]{"user.fexp",2});
		product.add(new Object[]{"product.fexp",0,200});
		ColumnList.put("product", product);	
		
		ArrayList<Object[]>  productmx=new ArrayList<Object[]>();
		productmx.add(new Object[]{"product.code",0});
		productmx.add(new Object[]{"product.name",0,200});
		productmx.add(new Object[]{"product.peso",2});
		productmx.add(new Object[]{"product.mode",0});
		productmx.add(new Object[]{"product.unit",2});
		productmx.add(new Object[]{"product.defaultprice",2});
		productmx.add(new Object[]{"product.defaultpoint",2});
		productmx.add(new Object[]{"product.status",0});
		productmx.add(new Object[]{"store.count",0});
		productmx.add(new Object[]{"store.defprice",0});
		ColumnList.put("productmx", productmx);	
		
		ArrayList<Object[]>  producttype=new ArrayList<Object[]>();
		producttype.add(new Object[]{"producttype.id",1});
		producttype.add(new Object[]{"producttype.name",0,200});
		producttype.add(new Object[]{"producttype.fexp",0,300});
		ColumnList.put("producttype", producttype);
		
		ArrayList<Object[]>  viptype=new ArrayList<Object[]>();
		viptype.add(new Object[]{"viptype.id",1});
		viptype.add(new Object[]{"viptype.name",0,200});
		viptype.add(new Object[]{"viptype.fexp",0,300});
		ColumnList.put("viptype", viptype);
		
		ArrayList<Object[]>  shop=new ArrayList<Object[]>();
		shop.add(new Object[]{"shop.id",1});
		shop.add(new Object[]{"shop.code",0});
		shop.add(new Object[]{"shop.name",0,200});
		shop.add(new Object[]{"shop.addr",2});
		shop.add(new Object[]{"shop.tel",0});
		shop.add(new Object[]{"shop.telmov",0});
		shop.add(new Object[]{"shop.createdate",2});
		shop.add(new Object[]{"shop.userid",1});
		shop.add(new Object[]{"user.code",2});
		shop.add(new Object[]{"user.name",0});
		shop.add(new Object[]{"user.sex",2});
		shop.add(new Object[]{"user.addr",2,200});
		shop.add(new Object[]{"user.tel",2});
		shop.add(new Object[]{"user.telmov",2});
		shop.add(new Object[]{"user.birthdate",2,0,"yyyy-MM-dd"});
		shop.add(new Object[]{"user.ccode",2});
		shop.add(new Object[]{"user.status",2});
		shop.add(new Object[]{"user.createdate",2});
		shop.add(new Object[]{"user.enterdate",2});
		shop.add(new Object[]{"user.exitdate",2});
		shop.add(new Object[]{"user.fexp",2});
		shop.add(new Object[]{"shop.fexp",0,200});
		ColumnList.put("shop", shop);
		//--------------------------------store---------------------
		
		ArrayList<Object[]>  store=new ArrayList<Object[]>();
		store.add(new Object[]{"store.id",1});
		store.add(new Object[]{"store.productid",1});
		store.add(new Object[]{"store.shopid",1});
		store.add(new Object[]{"product.id",1});
		store.add(new Object[]{"product.code",0});
		store.add(new Object[]{"product.name",0,200});
		store.add(new Object[]{"product.mode",2});
		store.add(new Object[]{"product.unit",2});
		store.add(new Object[]{"product.peso",2});
		store.add(new Object[]{"producttype.name",2});
		store.add(new Object[]{"product.status",0});
		store.add(new Object[]{"store.count",0});
		store.add(new Object[]{"store.defprice",2});
		store.add(new Object[]{"store.cbprice",0});//!!!!!!!!注意：2
		ColumnList.put("storeinit", store);
		ArrayList<Object[]>  store1=new ArrayList<Object[]>();
		store1.add(new Object[]{"checkmain.id",1});
		store1.add(new Object[]{"checkdetail.productid",1});
		store1.add(new Object[]{"checkmain.shopid",1});
		store1.add(new Object[]{"product.id",1});
		store1.add(new Object[]{"product.code",0});
		store1.add(new Object[]{"product.name",0,200});
		store1.add(new Object[]{"product.mode",2});
		store1.add(new Object[]{"product.unit",2});
		store1.add(new Object[]{"product.peso",2});
		store1.add(new Object[]{"producttype.name",2});
		store1.add(new Object[]{"product.status",0});
		store1.add(new Object[]{"checkdetail.count",0});
		store1.add(new Object[]{"checkdetail.fexp",2});
		ColumnList.put("store", store1);
		//--------------------------------user---------------------
		
		ArrayList<Object[]>  user=new ArrayList<Object[]>();
		user.add(new Object[]{"user.id",1});
		user.add(new Object[]{"user.code",0});
		user.add(new Object[]{"user.name",0});
		user.add(new Object[]{"user.pass",1});
		user.add(new Object[]{"user.shopid",1});
		
		user.add(new Object[]{"user.sex",0});
		user.add(new Object[]{"user.addr",2});
		user.add(new Object[]{"user.tel",2});
		user.add(new Object[]{"user.telmov",0});
		user.add(new Object[]{"user.birthdate",2});
		user.add(new Object[]{"user.ccode",2});
		user.add(new Object[]{"user.status",0});
		user.add(new Object[]{"user.createdate",2});
		user.add(new Object[]{"user.exitdate",2});
		user.add(new Object[]{"user.userid",1});
		user.add(new Object[]{"user.fright",1});
		user.add(new Object[]{"user.fexp",2});
		user.add(new Object[]{"user.u_name",0});
		user.add(new Object[]{"user.u_code",2});
		user.add(new Object[]{"user.u_sex",2});
		user.add(new Object[]{"user.u_tel",2});
		user.add(new Object[]{"user.u_telmov",2});
		ColumnList.put("user", user);
		
		ArrayList<Object[]>  vip=new ArrayList<Object[]>();
		vip.add(new Object[]{"vip.id",1});
		vip.add(new Object[]{"vip.code",0});
		vip.add(new Object[]{"vip.name",0});
		vip.add(new Object[]{"vip.shopid",1});
		vip.add(new Object[]{"vip.viptypeid",1});
		vip.add(new Object[]{"vip.sex",0});
		vip.add(new Object[]{"vip.addr",0});
		vip.add(new Object[]{"vip.tel",0});
		vip.add(new Object[]{"vip.telmov",0});
		vip.add(new Object[]{"vip.birthdate",0,0,"yyyy-MM-dd"});
		vip.add(new Object[]{"vip.ccode",2});
		vip.add(new Object[]{"vip.amount",0});
		vip.add(new Object[]{"vip.point",0});
		vip.add(new Object[]{"vip.status",2});
		vip.add(new Object[]{"vip.createdate",2});
		vip.add(new Object[]{"vip.userid",1});
		vip.add(new Object[]{"user.code",2});
		vip.add(new Object[]{"user.name",0});
		vip.add(new Object[]{"user.sex",2});
		vip.add(new Object[]{"user.addr",2,200});
		vip.add(new Object[]{"user.tel",2});
		vip.add(new Object[]{"user.telmov",2});
		vip.add(new Object[]{"user.birthdate",2,0,"yyyy-MM-dd"});
		vip.add(new Object[]{"user.ccode",2});
		vip.add(new Object[]{"user.status",2});
		vip.add(new Object[]{"user.createdate",2});
		vip.add(new Object[]{"user.enterdate",2});
		vip.add(new Object[]{"user.exitdate",2});
		vip.add(new Object[]{"user.fexp",2});
		vip.add(new Object[]{"shop.code",2});
		vip.add(new Object[]{"shop.name",0});
		vip.add(new Object[]{"shop.addr",2,200});
		vip.add(new Object[]{"shop.tel",2});
		vip.add(new Object[]{"shop.telmov",2});
		vip.add(new Object[]{"shop.fexp",2,200});
		vip.add(new Object[]{"shop.createdate",2});
		vip.add(new Object[]{"vip.jsr",2});
		vip.add(new Object[]{"vip.fexp",0,200});
		ColumnList.put("vip", vip);
		
		ArrayList<Object[]>  vip_tjmx=new ArrayList<Object[]>();
		vip_tjmx.add(new Object[]{"tmp_mxtj.orderid",1});
		vip_tjmx.add(new Object[]{"tmp_mxtj.ordercode",0,60});
		vip_tjmx.add(new Object[]{"tmp_mxtj.ordertype",0,60});
		vip_tjmx.add(new Object[]{"tmp_mxtj.orderdate",0,80,"yyyy-MM-dd"});
		vip_tjmx.add(new Object[]{"tmp_mxtj.shopname",0});
		vip_tjmx.add(new Object[]{"tmp_mxtj.amount",0,50});
		vip_tjmx.add(new Object[]{"tmp_mxtj.inje",0,50});
		vip_tjmx.add(new Object[]{"tmp_mxtj.outje",0,50});
		vip_tjmx.add(new Object[]{"tmp_mxtj.je",0,50});
		vip_tjmx.add(new Object[]{"tmp_mxtj.inpoint",0,50});
		vip_tjmx.add(new Object[]{"tmp_mxtj.outpoint",0,50});
		vip_tjmx.add(new Object[]{"tmp_mxtj.point",0,50});
		vip_tjmx.add(new Object[]{"tmp_mxtj.username",0,50});
		ColumnList.put("tj_vipmx", vip_tjmx);
		
		ArrayList<Object[]>  vip_tj=new ArrayList<Object[]>();
		vip_tj.add(new Object[]{"tmp_vip_tj.vipid",1});
		vip_tj.add(new Object[]{"tmp_vip_tj.vipname",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.je1",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.point1",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.je11",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.point11",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.je12",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.point12",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.je2",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.point2",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.je3",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.point3",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.je4",0});
		vip_tj.add(new Object[]{"tmp_vip_tj.point4",0});
		vip_tj.add(new Object[]{"vip.code",2});
		vip_tj.add(new Object[]{"vip.name",2});
		vip_tj.add(new Object[]{"vip.sex",2});
		vip_tj.add(new Object[]{"vip.addr",2});
		vip_tj.add(new Object[]{"vip.tel",2});
		vip_tj.add(new Object[]{"vip.telmov",2});
		vip_tj.add(new Object[]{"vip.birthdate",2,0,"yyyy-MM-dd"});
		vip_tj.add(new Object[]{"vip.ccode",2});
		vip_tj.add(new Object[]{"vip.amount",0});
		vip_tj.add(new Object[]{"vip.point",0});
		vip_tj.add(new Object[]{"vip.status",2});
		ColumnList.put("tj_vip", vip_tj);
		
		ArrayList<Object[]>  user_tj=new ArrayList<Object[]>();
		user_tj.add(new Object[]{"tmp_user_tj.userid",1});
		user_tj.add(new Object[]{"tmp_user_tj.username",0});
		user_tj.add(new Object[]{"tmp_user_tj.je1",0});
		user_tj.add(new Object[]{"tmp_user_tj.point1",2});
		user_tj.add(new Object[]{"tmp_user_tj.count1",2});
		
		
		user_tj.add(new Object[]{"tmp_user_tj.je2",0});
		user_tj.add(new Object[]{"tmp_user_tj.point2",2});
		user_tj.add(new Object[]{"tmp_user_tj.count2",2});
		
		user_tj.add(new Object[]{"tmp_user_tj.je11",0});
		user_tj.add(new Object[]{"tmp_user_tj.point11",2});
		user_tj.add(new Object[]{"tmp_user_tj.count11",2});
		user_tj.add(new Object[]{"tmp_user_tj.je12",0});
		user_tj.add(new Object[]{"tmp_user_tj.point12",2});
		user_tj.add(new Object[]{"tmp_user_tj.count12",2});
		
		user_tj.add(new Object[]{"tmp_user_tj.je3",0});
		user_tj.add(new Object[]{"tmp_user_tj.count3",2});
		user_tj.add(new Object[]{"tmp_user_tj.je4",0});
		user_tj.add(new Object[]{"tmp_user_tj.count4",2});
		user_tj.add(new Object[]{"tmp_user_tj.je5",0});
		user_tj.add(new Object[]{"tmp_user_tj.point5",2});
		user_tj.add(new Object[]{"tmp_user_tj.count5",2});
		user_tj.add(new Object[]{"tmp_user_tj.xj5",0});
		user_tj.add(new Object[]{"tmp_user_tj.je6",0});
		user_tj.add(new Object[]{"tmp_user_tj.point6",2});
		user_tj.add(new Object[]{"tmp_user_tj.count6",2});
		user_tj.add(new Object[]{"tmp_user_tj.xj6",0});
		user_tj.add(new Object[]{"tmp_user_tj.count7",2});
		user_tj.add(new Object[]{"tmp_user_tj.count8",2});
		user_tj.add(new Object[]{"tmp_user_tj.count9",2});
		user_tj.add(new Object[]{"user.code",2});
		user_tj.add(new Object[]{"user.name",2});
		user_tj.add(new Object[]{"user.sex",2});
		user_tj.add(new Object[]{"user.addr",2,200});
		user_tj.add(new Object[]{"user.tel",2});
		user_tj.add(new Object[]{"user.telmov",2});
		user_tj.add(new Object[]{"user.birthdate",2,0,"yyyy-MM-dd"});
		user_tj.add(new Object[]{"user.ccode",2});
		user_tj.add(new Object[]{"user.status",2});
		user_tj.add(new Object[]{"user.createdate",2});
		user_tj.add(new Object[]{"user.enterdate",2});
		user_tj.add(new Object[]{"user.exitdate",2});
		user_tj.add(new Object[]{"user.fexp",2});
		ColumnList.put("tj_user", user_tj);
		
		ArrayList<Object[]>  shop_tj=new ArrayList<Object[]>();
		shop_tj.add(new Object[]{"tmp_shop_tj.shopid",1});
		shop_tj.add(new Object[]{"tmp_shop_tj.shopname",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.storeamount",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.inamount",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.movinamount",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.movoutamount",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.saleamount",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.xj1",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.saletamount",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.xj2",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.samount",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.yamount",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.saleallamount",0});
		shop_tj.add(new Object[]{"tmp_shop_tj.allamount",0});
		shop_tj.add(new Object[]{"shop.code",2});
		shop_tj.add(new Object[]{"shop.name",2});
		shop_tj.add(new Object[]{"shop.addr",2,200});
		shop_tj.add(new Object[]{"shop.tel",2});
		shop_tj.add(new Object[]{"shop.telmov",2});
		shop_tj.add(new Object[]{"shop.fexp",2,200});
		shop_tj.add(new Object[]{"shop.createdate",2});
		ColumnList.put("tj_shop", shop_tj);
	
		ArrayList<Object[]>  product_tj=new ArrayList<Object[]>();
		product_tj.add(new Object[]{"tmp_product_tj.productid",1});
		product_tj.add(new Object[]{"tmp_product_tj.productname",0,200});
		product_tj.add(new Object[]{"tmp_product_tj.incount",0});
		product_tj.add(new Object[]{"tmp_product_tj.inamount",0});
		product_tj.add(new Object[]{"tmp_product_tj.intcount",0});
		product_tj.add(new Object[]{"tmp_product_tj.intamount",0});
		product_tj.add(new Object[]{"tmp_product_tj.outcount",0});
		product_tj.add(new Object[]{"tmp_product_tj.outcount1",0});
		product_tj.add(new Object[]{"tmp_product_tj.outamount",0});
		product_tj.add(new Object[]{"tmp_product_tj.outtcount",0});
		product_tj.add(new Object[]{"tmp_product_tj.outtcount1",0});
		product_tj.add(new Object[]{"tmp_product_tj.outtamount",0});
		product_tj.add(new Object[]{"tmp_product_tj.movcount",0});
		product_tj.add(new Object[]{"tmp_product_tj.movamount",0});
		product_tj.add(new Object[]{"tmp_product_tj.scount",0});
		product_tj.add(new Object[]{"tmp_product_tj.samount",0});
		product_tj.add(new Object[]{"tmp_product_tj.ycount",0});
		product_tj.add(new Object[]{"tmp_product_tj.yamount",0});
		product_tj.add(new Object[]{"product.code",2});
		product_tj.add(new Object[]{"product.name",2,200});
		product_tj.add(new Object[]{"product.mode",2});
		product_tj.add(new Object[]{"product.unit",2});
		product_tj.add(new Object[]{"product.peso",2});
		product_tj.add(new Object[]{"producttype.name",2});
		product_tj.add(new Object[]{"product.status",2});
		ColumnList.put("tj_product", product_tj);
		
		ArrayList<Object[]>  all_tj=new ArrayList<Object[]>();
		
		all_tj.add(new Object[]{"tmp_all_tj.amount1",0});
		all_tj.add(new Object[]{"tmp_all_tj.point1",0});
		all_tj.add(new Object[]{"tmp_all_tj.amount2",0});
		all_tj.add(new Object[]{"tmp_all_tj.point2",0});
		all_tj.add(new Object[]{"tmp_all_tj.count3",0});
		all_tj.add(new Object[]{"tmp_all_tj.amount3",0});
		all_tj.add(new Object[]{"tmp_all_tj.count4",0});
		all_tj.add(new Object[]{"tmp_all_tj.amount4",0});
		all_tj.add(new Object[]{"tmp_all_tj.count5",0});
		all_tj.add(new Object[]{"tmp_all_tj.amount5",0});
		all_tj.add(new Object[]{"tmp_all_tj.point5",0});
		all_tj.add(new Object[]{"tmp_all_tj.count6",0});
		all_tj.add(new Object[]{"tmp_all_tj.amount6",0});
		all_tj.add(new Object[]{"tmp_all_tj.point6",0});
		all_tj.add(new Object[]{"tmp_all_tj.count7",0});
		all_tj.add(new Object[]{"tmp_all_tj.amount7",0});
		all_tj.add(new Object[]{"tmp_all_tj.count8",0});
		all_tj.add(new Object[]{"tmp_all_tj.amount8",0});
		all_tj.add(new Object[]{"tmp_all_tj.count9",0});
		all_tj.add(new Object[]{"tmp_all_tj.amount9",0});
		ColumnList.put("tj_all", all_tj);
	}
	
	public static void SaveColumnInfos(ArrayList<ColumnInfo> infos,String mark){
		
		User_ArrayList list = new User_ArrayList();
		for(ColumnInfo i:infos) list.add(i.getbytes());
		String path=System.getProperty("user.dir")+"\\Properties\\col_"+mark+".Properties";
		try {
		FileOutputStream fo = new FileOutputStream(path);
			fo.write(list.GetBytes());
			fo.close();
		} catch (IOException e) {
		}
	}
	public static ArrayList<ColumnInfo> GetColumnInfosByFile(String mark){
		String path=System.getProperty("user.dir")+"\\Properties\\col_"+mark+".Properties";
		File f = new File(path);
		 ArrayList<ColumnInfo> mylist = new ArrayList<ColumnInfo>();
		if(f.exists()){
			
			try{
				FileInputStream in=new FileInputStream(f);
				byte[] data= new  byte[(int) f.length()];
				in.read(data);
				in.close();
				User_ArrayList list = new User_ArrayList();
				list.SetBytes(data);
				for(Object o:list){
					ColumnInfo inf = new ColumnInfo();
					inf.setbytes((byte[])o);
					mylist.add(inf);
				}
			}catch (Exception e) {
				return mylist;
			}
		}
		return  mylist;
	}
	public static ArrayList<ColumnInfo> GetColumnInfos(ArrayList<Object[]> list){
		ArrayList<ColumnInfo> infos = new ArrayList<ColumnInfo>();
		for(int i=0;i<list.size();i++){
			int p = (Integer)(list.get(i)[1]);
			String c=(String)(list.get(i)[0]);
			int wid = 0;
			if(list.get(i).length==3)wid=(Integer)(list.get(i)[2]);
			String format="";
			if(list.get(i).length==4)format=list.get(i)[3].toString();
			switch (p) {
			case 0:
				infos.add(ColumnInfo.CreateBasicColumnInfo(c, txts.getProperty(c,""),wid,format));
				break;
			case 1:
				infos.add(ColumnInfo.CreateIdColumnInfo(c, txts.getProperty(c,""),wid,format));
				break;
			case 2:
				infos.add(ColumnInfo.CreateHideColumnInfo(c, txts.getProperty(c,""),wid,format));
				break;
			}
		}
		return infos;
	}
	public static ArrayList<ColumnInfo> GetColumnInfos(String mark){
		ArrayList<ColumnInfo> infos = new ArrayList<ColumnInfo>();
		infos = GetColumnInfosByFile(mark);
		if(infos.size()>0) return infos;
		ArrayList<Object[]> list= ColumnList.get(mark);
		return GetColumnInfos(list);
	}
	}
