package models;

public class D�partement {
	private int id;
	private String intitul�;
    private Enseignant chef;
    
    public D�partement(Enseignant chef,String intitul�){
    	this.chef=chef;
    	this.intitul�=intitul�;
    }
   
      public int getid()
      {return this.id;} 
    
      public void setid(int x)
      {this.id=x;}
      
      public Enseignant getchef()
      {return this.chef;} 
    
      public void setchef(Enseignant chef)
      {this.chef=chef;}
      
      public String getintitul�()
      {return this.intitul�;} 
    
      public void setintitul�(String intitul�)
      {this.intitul�=intitul�;}
      
      

}
