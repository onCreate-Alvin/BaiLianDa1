

package model;

import utils.tools;


public class product {
	         
	 private int id;
     private String code;
     private String zjm;
     private String name;
     private String peso;//重量
     private String mode;//模式
     private String unit;//单位
     private int producttypeid;
     private double defaultprice;
     private double defaultpoint;
     private int status;
     private String createdate;
     private int userid;
     private String fexp;
     private String statusname,typename,u_name;
     
     
     
     
     
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getStatusname() {
		return tools.productstatus[status][1];
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
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getProducttypeid() {
		return producttypeid;
	}
	public void setProducttypeid(int producttypeid) {
		this.producttypeid = producttypeid;
	}
	public double getDefaultprice() {
		return defaultprice;
	}
	public void setDefaultprice(double defaultprice) {
		this.defaultprice = defaultprice;
	}
	public double getDefaultpoint() {
		return defaultpoint;
	}
	public void setDefaultpoint(double defaultpoint) {
		this.defaultpoint = defaultpoint;
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

	public String getFexp() {
		return fexp;
	}
	public void setFexp(String fexp) {
		this.fexp = fexp;
	}
	public String getZjm() {
		return zjm;
	}
	public void setZjm(String zjm) {
		this.zjm = zjm;
	}
 
}
