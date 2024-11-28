package services;

import java.util.List;


import models.Etudiant;
import models.Fili�re;

public class EtudiantServices {
		
		public static void addEtud (String nom,String pr�nom,String email,int apogee,Fili�re fili�re){
			Etudiant etudiant = new Etudiant(nom,pr�nom,email,apogee,fili�re);
			etudiant.setid(DB.getid_ETUD());
			DB.etudiants.add(etudiant);
		}
		
		public static void updateEtud(int id ,String nom,String pr�nom,String email,int apogee,Fili�re fili�re){
			 for (Etudiant x:DB.etudiants){
				 if(x.getid()==id){
					x.setapogee(apogee);x.setemail(email); x.setFil(fili�re);x.setnom(nom);x.setpr�nom(pr�nom); 
				 }	 
			 }
		}
		public static void delelteEtud(int id){
			DB.etudiants.remove(getEtudById(id));
			
		}
		public static List<Etudiant> getAllEtud(){
			return   DB.etudiants;	
		}
		
		public static Etudiant getEtudById(int id){
	          for (Etudiant x : DB.etudiants){
	        if(x.getid()==id) return x;
	        }
			return null;
	        }
	}


