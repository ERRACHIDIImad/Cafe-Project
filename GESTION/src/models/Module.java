package models;

public class Module{
	private int id;
	private String intitul�;
    private Fili�re fili�re;
    private Enseignant prof;
	
	  public Module(String intitul�,Fili�re fili�re,Enseignant prof){
	    	this.prof=prof;this.intitul�=intitul�;this.fili�re=fili�re;
	  }
	  public int getid()
      {return this.id;} 
	  public void setid(int x)
      {this.id=x;}
	  
	  public String getintitul�()
      {return this.intitul�;} 
	  public void setintitul�(String x)
      {this.intitul�=x;}
	  
	  public Fili�re getfili�re()
      {return this.fili�re;} 
	  public void setfili�re(Fili�re x)
      {this.fili�re=x;}
	  public Enseignant getprof()
      {return this.prof;} 
	  public void setprof(Enseignant x)
      {this.prof=x;}
	  
}

