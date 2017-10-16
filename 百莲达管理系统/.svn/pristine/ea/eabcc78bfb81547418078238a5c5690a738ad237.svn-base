package utils;

public class SearchInfo {
//where ,sort,limit
// pageno

	public static int maxrow=8;
	
	private String where,sort,limit;
	private int pageno,nextpage,prepage,pagecount;	
	private String table,col,value,math="=",type="String";
	private boolean canpage=true;
	private long rowcount=0;
	
	
	public static int getMaxrow() {
		return maxrow;
	}

	public static void setMaxrow(int maxrow) {
		SearchInfo.maxrow = maxrow;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SearchInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SearchInfo(String where) {
		super();
		this.where = where;
	}

	public SearchInfo(boolean canpage) {
		super();
		this.canpage = canpage;
	}

	public String getWhere() {
		if(where!=null&&where.length()>0)return where;
		else{
			if(table!=null&&table.length()>0){
				if(value.length()==0) return where;
				
				String v=value;
				if(math.equalsIgnoreCase("like")) v=" '%"+v+"%'";
				else if(type.equalsIgnoreCase("string")) v="'"+v+"'";
				return " where "+table+"."+col+" "+math+" "+v+" ";
			}
		}
		return "";
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getLimit() {
		if(!canpage) return "";
		if(pageno==0)pageno=1;
		int pos=(pageno-1)*maxrow;
		return " limit "+pos+","+maxrow;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {		
		this.pageno = pageno;
	}
	public int getNextpage() {
		return nextpage;
	}
	public void setNextpage(int nextpage) {
		this.nextpage = nextpage;
	}
	public int getPrepage() {
		return prepage;
	}
	public void setPrepage(int prepage) {
		this.prepage = prepage;
	}
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public long getRowcount() {
		return rowcount;
	}
	public void setRowcount(long rowcount) {
		this.rowcount = rowcount;
		if(rowcount==0){			
			pagecount=1;
		}else{
		pagecount=((int)(rowcount-1)/maxrow)+1;
		}
		if(pageno==0)pageno=1;
		if(pageno<pagecount)nextpage=pageno+1;
		else nextpage=pageno;
		
		if(pageno>2)prepage=pageno-1;
		else prepage=1;
		
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public boolean isCanpage() {
		return canpage;
	}
	public void setCanpage(boolean canpage) {
		this.canpage = canpage;
	}
	
	
}
