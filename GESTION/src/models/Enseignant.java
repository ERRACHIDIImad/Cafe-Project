package models;

public class Enseignant {
	private int id;
	private String nom;
	private String pr�nom;
	private String email;
	private String grade;
	private D�partement Dept;
	public Enseignant(){}
	  public Enseignant(String nom,String pr�nom,String email,String grade ,D�partement dept){
	      this.Dept=dept;this.grade=grade;this.email=email;this.nom=nom;this.pr�nom=pr�nom;
	    }
	  public int getid()
      {return this.id;} 
	  public void setid(int x)
      {this.id=x;}
	  
	  public String getnom()
      {return this.nom;} 
	  public void setnom(String x)
      {this.nom=x;}
	  
	  public String getpr�nom()
      {return this.pr�nom;} 
	  public void setpr�nom(String x)
      {this.pr�nom=x;} 
	  
	  public String getemail()
      {return this.email;} 
	  public void setemail(String x)
      {this.email=x;}
	  
	  
	  public String getgrade()
      {return this.grade;} 
	  public void setgrade(String x)
      {this.grade=x;}
	  
	  public D�partement getDept()
      {return this.Dept;} 
	  public void setDept(D�partement x)
      {this.Dept=x;}
	  
	  
}
