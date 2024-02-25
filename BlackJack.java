
package Blackjackpart2;

//import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import ConnexionJDBC.Connexion;

public class BlackJack {

	public static void main(String[] args)  {
		
Main majoueur=new Main();

System.out.println(majoueur.getNombres_cartes(4));

System.out.println(majoueur.getValeurTotal(4));



	}
	
}
