//package tyss.first;
//

//
//}
package tyss.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class fetch_all_record {

	public static void main(String[] args) {
		 String url = "jdbc:mysql://localhost:3306/company";
	        String username = "root";
	        String password = "Ag202089";

		System.out.println("ka hal chal ba");
		 try {
			// step 1 : Load the driver
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded ");
			 // step 2 : Establish the connection
			Connection con = DriverManager.getConnection(url, username, password);
			
			
			//3.create the statement
			Statement stm = con.createStatement();
			System.out.println("statement is created");

			String query = "select  from st";
			// step 4 : Execute the query
			stm.execute(query);
			// step 5 : Close the connection
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
