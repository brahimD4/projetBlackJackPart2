
package blackjack;

import java.util.Scanner;

import Blackjackpart2.Connexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BlackJack {

	public static void main(String[] args) {
	
		Connection connex=Connexion.connexionDB();
		
  PaquetCartes paquet1=new PaquetCartes();
  paquet1.RemplirPaquet();
  paquet1.MelangerCartes();
  
  Main mainjoueur1=new Main();
  Main maincroupier=new Main();
  
  Joueur joueur1=new Joueur(mainjoueur1);
 Croupier croupier1=new Croupier(maincroupier);
 

 
	Scanner scan =new Scanner(System.in);
    int choix=0;
do {
	System.out.println();
	System.out.println("-----------------------------------------Jeu BlackJack----------------------------------------------------------");
	System.out.println("                 1:Commencer le jeu");
	System.out.println();
	System.out.println("                 *:Solde = "+joueur1.getSolde()+"  piece");
	System.out.println();
	System.out.println("                 3:Quiter le jeu");
	System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	System.out.printf("Votr choix= ");
	choix=scan.nextInt();

  switch(choix) {
  
  case 1:
	  //si le solde est egale 0
	  if(joueur1.getSolde()==0) {
			System.out.println("***************** *");
			System.out.printf("   votre solde est 0  piece ");
			System.out.println("****************** ");
		  break;
	  }
      //commencer le jeu
     croupier1.DistribuerLesCartes(paquet1, joueur1);
     int mise;
     //verifier le solde
     do {
    		System.out.printf("la Mise =   ");
    	mise =scan.nextInt();
     }while(joueur1.verifirMise(mise)==2);

     
do {
    croupier1.AfficheMainCroupier();
    joueur1.AfficheMainJoueur();
    
  //choisir Hit or Stand
    System.out.println("    1:Hit");
    if(croupier1.mainCR.getValeurTotal()<17) {
    System.out.println("    2:Stand");
    }
   	
   	System.out.printf(" Choix= ");
   	int choix1=scan.nextInt();
   	
  //si le joueur choisi Hit
   	if(choix1==1) {
   		joueur1.jRecoirCarte(paquet1);
   		
   	}else {
   	//si le joueur choisir Stand
   		if(choix1==2) {
   			
   	//le croupier recoit les cartes jusqua attendre 17
   		while(croupier1.mainCR.getValeurTotal()<17) {
   			croupier1.cRecoirCarte(paquet1);
   		}
   		
   	}else {
   		//si le joueur choisir ni hit ni Stand
   		System.out.println(" jourur choisir ni  Stand ni  Hit");
    }
   	}
   	
    
    //fin de commencer le jeu
    
    //Verifier les resultat 
    //si le coupier depasse 21 
    if( croupier1.mainCR.getValeurTotal()>21||(joueur1.mainJR.getValeurTotal()==21&&croupier1.mainCR.getValeurTotal()<21) ) {
    	 croupier1.AfficheMainCroupier();
    	    joueur1.AfficheMainJoueur();
    	 	 System.out.println(" ::::::::::::::::::::::::::::::::::");
     	    System.out.println("        Vous etes Ganez   ");
 	        System.out.println(" :::::::::::::::::::::::::::::::::::");
 	       joueur1.incrementSolde(mise);
    }else {
   	 
   	 //si le  joueur depasse 21
   	 if(joueur1.mainJR.getValeurTotal()>21||(croupier1.mainCR.getValeurTotal()==21&&joueur1.mainJR.getValeurTotal()<21)) {
   		 croupier1.AfficheMainCroupier();
   	    joueur1.AfficheMainJoueur();
	 	  System.out.println(" ::::::::::::::::::::::::::::::::::::");
  	      System.out.println("     Vous etes echoue     ");
	      System.out.println(" ::::::::::::::::::::::::::::::::::::");
	      joueur1.disincrementSolde(mise);
   	 }else {
   		 
   		 //si les deux main sont egaux
   		 if(croupier1.mainCR.getValeurTotal()==21&&joueur1.mainJR.getValeurTotal()==21
   				 &&(croupier1.mainCR.nbCartes==joueur1.mainJR.nbCartes)) {
   			 croupier1.AfficheMainCroupier();
   		    joueur1.AfficheMainJoueur();
   	 	 System.out.println(" ::::::::::::::::::::::::::::::::::::::");
  	     System.out.println("       vous etes egeaux       ");
	     System.out.println(" :::::::::::::::::::::::::::::::::::::::");
	   
	     
   		 }
   		  
   	 }
    }
   
	
}while(croupier1.mainCR.getValeurTotal()<21&&joueur1.mainJR.getValeurTotal()<21);
	  break;
	  
  case 3:
	     System.out.println(" Vous etes sorte");
	  break;
	  
	  default:
		     System.out.println(" choisir 1 ou 3");
		     break;
  }//fin de switch

  //vider les listes des main apres le jeu
  croupier1.mainCR.listCartes.clear();
  joueur1.mainJR.listCartes.clear();

}while(choix!=3);
     
	}//FIN de fonction principale main
	
}
