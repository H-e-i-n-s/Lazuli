public class Relationship{
	String desc;
	String meta;
	Data start; //X is a Y
	Data end;
	Relationship self;
	
	public Relationship(){
		desc = "";
		meta = "";
		start = new Data();
		end = new Data();
		self = this;
	}
	
	public Relationship(String des, String met, Data s, Data e){
		desc = des;
		meta = met;
		start = s;
		end = e;
		self = this;
	}
	public String getDesc(){
		return desc;
	}
	public String getMeta(){
		return meta;
	}
	public Data getStart(){
		return start;
	}
	public Data getEnd(){
		return end;
	}
	public void link(Data s, Data b){
		start = s;
		end = b;
	}
	public void setDesc(String a){
		desc = a;
	}
}