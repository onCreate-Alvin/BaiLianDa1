package model;

import utils.tools;

public class vip {
	private int id;// 唯一值
	private String code;// 会员编号
	private String name;// 会员姓名
	private int shopid;// 所属分店
	private int viptypeid;// 会员类型
	private int sex;// 性别
	private String addr;// 地址
	private String tel;// 电话
	private String telmov;// 手机
	private String birthdate;// 生日
	private String ccode;// 身份证号
	private String amount;// 会员内存金额
	private String point;// 会员积分
	private int status;// 会员状态
	private String createdate;// 会员开通日期
	private int userid;// 创建人
	private String jsr;// 介绍人
	private String fexp;// 备注

	private String u_name,s_name,sexname;
	
	
	
	public String getSexname() {
		return tools.sexnames[sex][1];
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public int getViptypeid() {
		return viptypeid;
	}

	public void setViptypeid(int viptypeid) {
		this.viptypeid = viptypeid;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTelmov() {
		return telmov;
	}

	public void setTelmov(String telmov) {
		this.telmov = telmov;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getJsr() {
		return jsr;
	}

	public void setJsr(String jsr) {
		this.jsr = jsr;
	}

	public String getFexp() {
		return fexp;
	}

	public void setFexp(String fexp) {
		this.fexp = fexp;
	}



}
