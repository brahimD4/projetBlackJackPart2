package Blackjackpart2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Joueur  {
	String nomjoueur;
	int solde;
	
	Connection connex=Connexion.connexionDB();
	   
	 
	public void createJoueur(int id_main) {
		
		String query="insert into joueur(name_joueur,solde_joueur,id_main)values('joueur',20,"+id_main+")" ;
		try {
			
			 Statement statemnt = connex.createStatement();
		       statemnt.executeUpdate(query);
		   System.out.println("le joueur est bien creer");
		   
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	
public void AfficheMainJoueur() {
	 System.out.println();
	 System.out.println(" ---------- Main de Joueur");
	 System.out.println();
//	mainJR.AffichelisteCartes();
	 System.out.println();
	 System.out.println();
	// System.out.println(" ----->Valeur Total=  "+mainJR.getValeurTotal());
	 System.out.println();
	// System.out.println(" ----->Nombre de Cartes=  "+mainJR.getNbCartes());
	 System.out.println("******************************************************************************");
}




}
