package services;

import java.util.List;

import models.D�partement;
import models.Enseignant;

public class EnseignantServices {
	
	public static void addEns(String nom,String pr�nom,String email,String grade ,D�partement dept){
		Enseignant m =new Enseignant(nom,pr�nom,email,grade,dept);
		m.setid(DB.getid_ENSEGNANT());
		DB.enseignants.add(m);
	}
	
	public static void updateEns(int id ,String nom,String pr�nom,String email,String grade ,D�partement dept){
		for (Enseignant e : DB.enseignants)
			if(e.getid()==id){
				e.setDept(dept);e.setemail(email);e.setgrade(grade);e.setnom(nom);e.setpr�nom(pr�nom);
			}
	}
	public static void delelteEns(int id){
		DB.enseignants.remove(getEnsById(id));
	}
	public static List<Enseignant> getAllEns(){
		return   DB.enseignants	;
	}
	
	public static Enseignant getEnsById(int id){
		for (Enseignant e: DB.enseignants)
			if(e.getid()==id){return e;}
		return null;
}
}

