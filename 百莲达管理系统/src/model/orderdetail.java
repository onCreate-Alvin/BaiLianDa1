package model;

public class orderdetail {
	int id;
	int orderid;
	int productid;
	Double count;
	double price;
	double amount;
	double point;
	String fexp;
	double cbprice=0;
	int srctype=0;
	String pname,pcode;
	
	
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public int getSrctype() {
		return srctype;
	}
	public void setSrctype(int srctype) {
		this.srctype = srctype;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public double getCbprice() {
		return cbprice;
	}
	public void setCbprice(double cbprice) {
		this.cbprice = cbprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public Double getCount() {
		return count;
	}
	public void setCount(Double count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getFexp() {
		return fexp;
	}
	public void setFexp(String fexp) {
		this.fexp = fexp;
	}
	
}
