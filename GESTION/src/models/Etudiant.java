package models;

import java.util.ArrayList;

import java.util.List;


public class Etudiant {
	   private int id;
       private String nom;
       private String pr�nom;
       private String email;
       private int apogee;
       private Fili�re fili�re;
       private List<Note> notes =new ArrayList<Note>();
       
       public Etudiant(String nom,String pr�nom,String email,int apogee,Fili�re fili�re){
	    	this.email=email;this.nom=nom;this.pr�nom=pr�nom;this.apogee=apogee;
	    	this.fili�re=fili�re;
	    	
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
       
       public Fili�re getFil()
       {return this.fili�re;} 
       public void setFil(Fili�re x)
       {this.fili�re=x;}
       
       public String getemail()
       {return this.email;} 
       public void setemail(String x)
       {this.email=x;}
       
       public int getapogee()
       {return this.apogee;} 
       
       public void setapogee(int x)
       {this.apogee=x;}
       
       public List<Note> getnotes()
       {return this.notes;} 
       public void setnotes(List<Note> x)
       {this.notes=x;}
       
}

