package services;
import models.D�partement;
import models.Enseignant;

public class DepartementServices {
	
	public static void addDept(Enseignant chef,String intitul�){
		D�partement departement = new D�partement(chef,intitul�);
		departement.setid(DB.getid_dept());
		DB.d�partements.add(departement);
	}
	
	public static void updateDept(int id ,Enseignant chef,String intitul�){
		for (D�partement d : DB.d�partements)
		if(d.getid()==id){
			d.setintitul�(intitul�);d.setchef(chef);
		}
		
	}
	public static void delelteDept(int id){
		DB.d�partements.remove(getDeptById(id));
	}
	public static D�partement[] getAllDept(){
		return  (D�partement[]) DB.d�partements.toArray();	
	}
	
	public static D�partement getDeptById(int id){
		for (D�partement d : DB.d�partements){
			if(d.getid()==id){
				return d;
			}
}
		return null;
	}
}
