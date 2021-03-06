package utils;

public class pagemanage {
	private int page;
	private int rows;
	private String where="";
	private String sort;
	private String order;
	boolean ispage=true;
	
	
	public pagemanage(String where, boolean ispage) {
		super();
		this.where = where;
		this.ispage = ispage;
	}

	public pagemanage(boolean ispage) {
		super();
		this.ispage = ispage;
	}

	public boolean isIspage() {
		return ispage;
	}

	public void setIspage(boolean ispage) {
		this.ispage = ispage;
	}

	public pagemanage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getOrder() {
		if(sort==null||sort.length()==0) return "";
		return " order by "+sort+" "+order +" ";
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public String getLimit(){
		if(page==0||!ispage)return "";
		int s=(page-1)*rows;
		return " limit "+s+","+rows;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		if(where==null||where.length()==0){
			this.where="";
			return;
		}
		this.where = where;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
}
