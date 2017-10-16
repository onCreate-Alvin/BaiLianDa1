package model;


public class SeachObject {
	int order=0;//录入序号
	String col;
	int type;//数据录入类型  0int 1double 2string 3date 4longdate 5selectid  6selectindex 
	int mathtype;//比较符   0==  1> 2< 3>= 4<= 5<> 6in 7notin 8bettow 9likel 10liker  11likea 
	String value;//值
	String value1;
	int andor=0;//0and  1or
	
	
	public SeachObject(int order, String col, int type,
			int mathtype, String value, String value1, int andor) {
		super();
		this.order = order;
		this.col = col;
		this.type = type;
		this.mathtype = mathtype;
		this.value = value;
		this.value1 = value1;
		this.andor = andor;
	}
	public boolean check(){
		if(value == null)return false;
		if(value.length()==0)return false;
		if(mathtype==8){
			if(value.length()==0||value1.length()==0)return false;
		}
		if(type==0||type==1){
			try{
				int a=Integer.valueOf(value);
			}catch (Exception e) {return false;
			}
		}
		return true;
		
	}
	public String getWhere(boolean islink){
		switch (mathtype) {
		case 1:
			return " "+col+">"+getValue()+" "+(islink?getANDRO()+" ":" ");
		case 2:
			return " "+col+"<"+getValue()+" "+(islink?getANDRO()+" ":" ");
		case 3:
			return " "+col+">="+getValue()+" "+(islink?getANDRO()+" ":" ");
		case 4:
			return " "+col+"<="+getValue()+" "+(islink?getANDRO()+" ":" ");
		case 5:
			return " "+col+"<>"+getValue()+" "+(islink?getANDRO()+" ":" ");
		case 6:
			return " "+col+" in ("+getValue()+") "+(islink?getANDRO()+" ":" ");
		case 7:
			return " "+col+" not in ("+getValue()+") "+(islink?getANDRO()+" ":" ");
		case 8:
			return " "+col+" between "+getValue()+" and "+getValue1()+" "+(islink?getANDRO()+" ":" ");
		case 10:
			return " "+col+" like '%"+value+"' "+(islink?getANDRO()+" ":" ");
		case 9:
			return " "+col+" like '"+value+"%' "+(islink?getANDRO()+" ":" ");
		case 11:
			return " "+col+" like '%"+value+"%' "+(islink?getANDRO()+" ":" ");
		default:
			return " "+col+"="+getValue()+" "+(islink?getANDRO()+" ":" ");
		}
	}
	public String getANDRO(){
		return andor==0?" and ":" or ";
	}
	public SeachObject() {
		// TODO Auto-generated constructor stub
	}
	
	public String getValue(){
		switch (type) {
		case 3:
			String d=value.substring(0, 4)+"年"+value.substring(5, 7)+"月"+value.substring(8)+"日";
			return "'"+d+"'";
		case 2:
		case 4:
			return "'"+value+"'";
		default:
			return value;
		}
	}
	public String getValue1(){
		switch (type) {
		case 2:
		case 3:
		case 4:
			return "\""+value1+"\"";
		default:
			return value1;
		}
	}
	
}
