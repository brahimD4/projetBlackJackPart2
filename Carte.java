package Blackjackpart2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import ConnexionJDBC.Connexion;

public class Carte {
   String type;
   String couleur;
    int valeurcarte;
	boolean affiche;
	
	Connection connex=Connexion.connexionDB();
	
public void AfficheCartesql() {
	
String query="SELECT typee,couleur_carte  FROM carte limit 1 ";
 
	try {
		
		 Statement statemnt = connex.createStatement();
	      ResultSet result = statemnt.executeQuery(query);
		  while(result.next()) {
			 type=result.getString(1);
			 couleur=result.getString(2);
				System.out.println("   {   "+type+"   |  |  "+couleur+"  }      ");
			}
	}catch(SQLException e) {
		
		System.out.println(e.getMessage());
	}	
}
}
