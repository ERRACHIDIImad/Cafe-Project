package controllers;

import java.util.Scanner;

import models.Module;
import services.DB;
import services.EnseignantServices;
import services.Fili�reServices;
import services.ModulesServices;

public class ModuleController {
	static Scanner scan =new Scanner(System.in);
public static void showMenu(){
		System.out.println("1- Show Module. \n2- Create Module.\n3- edit Module.\n4- delete Module.");
		int a= scan.nextInt();
		switch (a){
		case 1:showModules();break;
		case 2:createModule();break;
		case 3:editModule();break;
		case 4:destroyModule();break;
		default :break;
		}
	}
	
    public static void showModules(){
    	for (Module d : DB.modules){
    		System.out.print("id: "+d.getid()+" | Intitul�: "+d.getintitul�()+"| Prof: "+d.getprof().getnom()+" "+d.getprof().getpr�nom());
    	    System.out.println("| Fili�re: "+d.getfili�re().getintitul�());
    		}	
    }
    
    public static void destroyModule(){
    	showModules();
    	System.out.println("Selectionner Module par id");int id=scan.nextInt();
       ModulesServices.delelteModule(id);
    }
    
    
    public static void createModule(){
    	System.out.println("Intitul�: ");String x=scan.nextLine();
    	Fili�reController.showFil();
    	System.out.println("Selectionner fili�re par id: ");int i=scan.nextInt();
    	EnseignantController.showEnseignant();
    	System.out.println("Selectionner enseignant par id: ");int i2=scan.nextInt();
    	   ModulesServices.addModule(x,Fili�reServices.getFilById(i),EnseignantServices.getEnsById(i2));
    			
    	
    			
	}
    	
    public static void editModule(){
    	showModules();
    	System.out.println("Selectionnez un Module par son id : ");int i =scan.nextInt();
    	System.out.println("Intitul� : ");String intitul� =scan.nextLine();
    	Fili�reController.showFil();
    	System.out.println("Selectionner fili�re par id: ");int i1=scan.nextInt();
    	EnseignantController.showEnseignant();
    	System.out.println("Selectionner enseignant par id: ");int i2=scan.nextInt();
    	ModulesServices.updateModule(i,intitul�,Fili�reServices.getFilById(i1),EnseignantServices.getEnsById(i2));
		
    	
		
}

}
