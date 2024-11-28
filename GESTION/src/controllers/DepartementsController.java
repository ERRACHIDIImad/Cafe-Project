package controllers;


import java.util.Scanner;


import models.D�partement;
import services.DB;
import services.DepartementServices;
import services.EnseignantServices;

public class DepartementsController {
	static Scanner scan =new Scanner(System.in);
	public static void showMenu(){
		System.out.println("1- Show department. \n2- Create departement.\n3- edit departement.\n4- delete departement.");
		int a= scan.nextInt();
		switch (a){
		case 1:showDepartements();break;
		case 2:createDepartement();break;
		case 3:editDepartement();break;
		case 4:destroyDepartement();break;
		default :break;
		}
	}
	
	
    public static void showDepartements(){
    	for (D�partement d : DB.d�partements){
    		System.out.print("id: "+d.getid()+" | Intitul�: "+d.getintitul�());
    	    System.out.println("| Chef: "+d.getchef().getnom()+" "+d.getchef().getpr�nom());
    		}
    }
    
    public static void destroyDepartement(){
    	showDepartements();
    	System.out.println("Selectionnez departement par son id : ");
    	int id =scan.nextInt();
    	DepartementServices.delelteDept(id);
    }
    
    
   
    public static void createDepartement(){
    	System.out.println("Intitul� de d�partement: ");
    	String a= scan.nextLine();
    	EnseignantController.showEnseignant();
    	System.out.println("Id de son chef: ");
    	int b = scan.nextInt();
    	DepartementServices.addDept(EnseignantServices.getEnsById(b),a);		
	}
    	
    public static void editDepartement(){
    	showDepartements();
    	System.out.println("Selectionnez un departement par son id : ");
    	int i =scan.nextInt();
    	System.out.println("Intitul� : ");String intitul� =scan.nextLine();
    	EnseignantController.showEnseignant();
    	System.out.println("id de son chef : ");int id =scan.nextInt();
    	DepartementServices.updateDept(i,EnseignantServices.getEnsById(id),intitul�);
		
}

}
