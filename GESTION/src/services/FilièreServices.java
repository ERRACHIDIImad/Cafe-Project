package services;

import java.util.List;

import models.D�partement;
import models.Enseignant;
import models.Fili�re;

public class Fili�reServices {
	
	public static void addFil(String intitul�,D�partement dept,Enseignant Chef){
		Fili�re f = new Fili�re(intitul�,dept,Chef);
		f.setid(DB.getid_FIL());
		DB.fili�res.add(f);
	}
	
	public static void updateFil(int id ,String intitul�,D�partement dept,Enseignant Chef){
		for (Fili�re f : DB.fili�res){
			if(f.getid()==id){
				f.setdept(dept);
				 f.setchef(Chef);
				 f.setintitul�(intitul�);
				}
			}
	}
	public static void delelteFil(int id){
				DB.fili�res.remove(getFilById(id));
			}
	public static List <Fili�re> getAllFil(){
		return   DB.fili�res;	
	}
	
	public static Fili�re getFilById(int id){
		for (Fili�re f : DB.fili�res){
			if(f.getid()==id){
				return f;
			}
}
		return null;
}
}


