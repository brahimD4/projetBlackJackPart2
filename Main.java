package Blackjackpart2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import ConnexionJDBC.Connexion;

public class Main {
	int valeurTotal;
	int nombrescartes;
	Connection connex=Connexion.connexionDB();
	
	public Main() {
	}
	
	//nombre de carte
	public int  getNombres_cartes(int id) {
		String query="select nbCartes_main from main where id_main="+id;
		try {
			
			 Statement statemnt = connex.createStatement();
		      ResultSet result = statemnt.executeQuery(query);
		      while(result.next()) {
				 nombrescartes=result.getInt(1);
					}
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
		return nombrescartes;
	}
	
	//valeur total 
	public int  getValeurTotal(int id) {
		String query="select valeurTotal_main from main where id_main="+id;
		try {
			
			 Statement statemnt = connex.createStatement();
		      ResultSet result = statemnt.executeQuery(query);
		      while(result.next()) {
				 valeurTotal=result.getInt(1);
						
					}
		}catch(SQLException e) {
			
			System.out.println(e);
		}
		return valeurTotal;
	}
	
	//vider un main
	public void ViderMain(){
		String query="delete from main where id_main !=0" ;
		try {
			
			 Statement statemnt = connex.createStatement();
		       statemnt.executeUpdate(query);
		   System.out.println("la main est bien vide");
		   
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
		
	

}

