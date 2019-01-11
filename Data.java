import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.management.relation.Relation;

public class Data{
	String data;
	String meta;
	String type;
	List<Relationship> isA;
	List<Relationship> hasA;
	Data self;
	
	public Data(){
		data = "";
		meta = "";
		isA = new LinkedList<Relationship>();
		hasA = new LinkedList<Relationship>();
		type = "";
		self = this;
		
	}
	public Data(String d, String t, String m){
		data = d;
		meta = m;
		isA = new LinkedList<Relationship>();
		hasA = new LinkedList<Relationship>();
		type = t;
		self = this;
	}
	
	public String getData(){
		return data;
	}
	
	public String getMeta(){
		return meta;
	}
	
	public String getType(){
		return type;
	}
	
	public void setData(String d){
		data = d;
	}
	
	public void setMeta(String m){
		meta = m;
	}
	
	public void setType(String t){
		type = t;
	}
	
	public void addRelation(String t, String desc, Data b){
		Relationship a = new Relationship();
		a.setDesc(desc);
		a.link(self, b);
		if(t == "isA"){
			isA.add(a);
		}
		else{
			hasA.add(a);
		}
	}
	
	
	
	
	
}