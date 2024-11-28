package controllers;

import java.util.Scanner;

import models.Fili�re;
import services.DB;
import services.DepartementServices;
import services.EnseignantServices;
import services.Fili�reServices;

public class Fili�reController {
	static Scanner scan =new Scanner(System.in);
	public static void showMenu(){
		System.out.println("1- Show Fili�re. \n2- Create Fili�re.\n3- edit Fili�re.\n4- delete Fili�re.");
		int a= scan.nextInt();
		switch (a){
		case 1:showFil();break;
		case 2:createFil();break;
		case 3:editFil();break;
		case 4:destroyFil();break;
		default :break;
		}
	}
	
    public static void showFil(){
    	for (Fili�re d : DB.fili�res){
    		System.out.println("id: "+d.getid()+" | Intitul�: "+d.getintitul�()+" | Chef: "+d.getchef().getnom()+" "+d.getchef().getpr�nom()+"| Apogee: "+d.getdept().getintitul�());
    	    System.out.println("| Modules: "+d.getModules());
    		}
    }
    
    public static void destroyFil(){
    	
    	showFil();
    	System.out.println("Selectionner Fili�re par id");int id=scan.nextInt();
       Fili�reServices.delelteFil(id);
    }
      
    public static void createFil(){
    	System.out.println("intitul�: ");String intitul�=scan.nextLine();
    	EnseignantController.showEnseignant();
 		System.out.println("Selectionner le Chef par id: ");int y=scan.nextInt();
 		DepartementsController.showDepartements();
 		System.out.println("Selectionner Le d�partement par id: ");int b=scan.nextInt();
 		Fili�reServices.addFil(intitul�,DepartementServices.getDeptById(b),EnseignantServices.getEnsById(y));	
 		  }
    	
    public static void editFil(){
    	showFil();
    	System.out.println("Selectionner Fili�re par id");int id=scan.nextInt();
    	System.out.println("intitul�: ");String x=scan.nextLine();
    	EnseignantController.showEnseignant();
 		System.out.println("Selectionner le Chef par id: ");int y=scan.nextInt();
 		DepartementsController.showDepartements();
 		System.out.println("Selectionner Le d�partement par id: ");int b=scan.nextInt();
 		Fili�reServices.updateFil(id,x,DepartementServices.getDeptById(b),EnseignantServices.getEnsById(y));
	   
}
}
