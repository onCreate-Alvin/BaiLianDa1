package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class client {
//	id code name addr tel telmov lxr bank creatdate userid exp
	private int id;
	private String code;
	private String name;
	private String addr;
	private String tel;
	private String telmov;
	private String lxr;
	private String bank;
	private String createdate;
	private int userid;
	private String fexp;
	private String u_name;
	
	
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
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
	public String getLxr() {
		return lxr;
	}
	public void setLxr(String lxr) {
		this.lxr = lxr;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getCreatedate() {
		if(createdate==null) return "";
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
	public String getFexp() {
		return fexp;
	}
	public void setFexp(String fexp) {
		this.fexp = fexp;
	}
	
}
