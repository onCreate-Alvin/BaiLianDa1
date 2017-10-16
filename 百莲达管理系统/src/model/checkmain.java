package model;

import java.sql.Date;

import utils.tools;

/**
 * check±í id checkcodE checknamE checkdatE shopiD status exP
 */

public class checkmain {
	private int id;
	private String checkcode;
	private String checkname;
	private String checkdate;
	private int shopid;
	private int status;
	private String fexp;
	
	private String shopname,checkstatus;
	

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getCheckstatus() {
		return tools.checkstatus[status][1];
	}

	public void setCheckstatus(String checkstatus) {
		this.checkstatus = checkstatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	public String getCheckname() {
		return checkname;
	}

	public void setCheckname(String checkname) {
		this.checkname = checkname;
	}

	public String getCheckdate() {
		return checkdate;
	}

	public void setCheckdate(String checkdate) {
		this.checkdate = checkdate;
	}

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getFexp() {
		return fexp;
	}

	public void setFexp(String fexp) {
		this.fexp = fexp;
	}


}
