package blackjack;

	
	import java.sql.Connection;
	import java.sql.DriverManager;

	public class Connexion {
	
		public static Connection connexionDB() {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/blackjack";
			String username="root";
			String password="root";
			
			Connection  conx=DriverManager.getConnection(url,username,password);
			
			return conx ;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
		}
		
		}


