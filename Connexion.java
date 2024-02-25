package Blackjackpart2;

	
	//import ConnexionJDBC.Connexion;
	import java.sql.Connection;
	import java.sql.DriverManager;

	public class Connexion {
		// ResultSet result;
		//public static void main(String[] args) {
			
		//}
		
		public static Connection connexionDB() {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/blackjack";
			String username="root";
			String password="root";
			//Statement  statemnt=conx.createStatement();
			
			Connection  conx=DriverManager.getConnection(url,username,password);
			//System.out.println("connexionbien bien etable");
	        // result=statemnt.executeQuery("SELECT * FROM a");
			return conx ;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
		}
		
		}


