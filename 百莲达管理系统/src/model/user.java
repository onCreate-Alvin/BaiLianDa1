package model;

import utils.tools;



public class user {
//	id code name pass shopid sex addr tel telmov birthdate ccode status 
//	 * 				creatdate exitdate userid fright fexp	
	int id;
	String code;
	String name;
	String pass;
	int shopid;
	int sex;
	String addr;
	String tel;
	String telmov;
	String birthdate;
	String ccode;
	int status;
	String createdate;
	String enterdate;
	String exitdate;
	int userid;
	String fright;
	String fexp;
	
	String u_name ;
	String sexname;
	String operatorstatus;
	
	
	
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user(int id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}
	public String getOperatorstatus() {
		return tools.operatorstatus[status][1];
	}
	public String getSexname() {
		return tools.sexnames[sex][1];
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getEnterdate() {
		return enterdate;
	}
	public void setEnterdate(String enterdate) {
		this.enterdate = enterdate;
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
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
	public String getExitdate() {
		return exitdate;
	}
	public void setExitdate(String exitdate) {
		this.exitdate = exitdate;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFright() {
		return fright;
	}
	public void setFright(String fright) {
		this.fright = fright;
	}
	public String getFexp() {
		return fexp;
	}
	public void setFexp(String fexp) {
		this.fexp = fexp;
	}
	
}
