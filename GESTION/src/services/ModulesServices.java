package services;

import java.util.List;


import models.Enseignant;
import models.Fili�re;
import models.Module;

public class ModulesServices {
	
	public static void addModule(String intitul�,Fili�re fili�re,Enseignant prof){
		Module m =new Module(intitul�,fili�re,prof);
		m.setid(DB.getid_ETUD());
		DB.modules.add(m);
	}
	
	public static void updateModule(int id, String intitul�,Fili�re fili�re,Enseignant prof){
		for (Module d : DB.modules)
			if(d.getid()==id){
				d.setfili�re(fili�re);d.setintitul�(intitul�);d.setprof(prof);
			}
	}
	public static void delelteModule(int id){
		DB.modules.remove(getModuleById(id));
	}
	public static List<Module> getAllModule(){
		return  DB.modules	;
	}
	
	public static Module getModuleById(int id){
		for (Module d : DB.modules)
			if(d.getid()==id){return d;}
		return null;
}
}
