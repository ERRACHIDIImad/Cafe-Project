package models;

import java.util.ArrayList;

public class Fili�re {
	private int id;
	private String intitul�;
	private Enseignant Chef;
	private D�partement dept;
	ArrayList<Module> modules = new ArrayList<Module>();
	
	  public Fili�re(String intitul�,D�partement dept,Enseignant Chef){
	    	this.Chef=Chef;this.dept=dept;this.intitul�=intitul�;
	    }
	  public int getid()
      {return this.id;} 
	  public void setid(int x)
      {this.id=x;}
	  
	  public String getintitul�()
      {return this.intitul�;} 
	  public void setintitul�(String x)
      {this.intitul�=x;}
	  
	  public D�partement getdept()
      {return this.dept;} 
	  public void setdept(D�partement x)
      {this.dept=x;}
	  
	  public Enseignant getchef()
      {return this.Chef;} 
	  public void setchef(Enseignant x)
      {this.Chef=x;}
	  
	  
	  public ArrayList<Module> getModules()
      {return this.modules;} 
	  public void setModules(ArrayList<Module> x)
      {this.modules=x;}
}
