package homework4june;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class method {
			static Connection connectionWithdb()throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homeWork4june","root","Shankar@1992");
		
				return con;
	}
		public void insert() throws Exception{
			System.out.println("plz provide sName");
			Scanner sc = new Scanner(System.in);
			
			String sName = sc.next();
			Connection db = connectionWithdb();
				 
				 PreparedStatement pst = db.prepareStatement("insert into javaclass(sName) value(?)");
				 pst.setString(1, sName);
				 
				 pst.executeUpdate();
				 	 
}
		public void read()throws Exception{
			Connection db = connectionWithdb();
			PreparedStatement pst = db.prepareStatement("select * from javaclass");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
		}
		
		public void Update() throws Exception{
			System.out.println("plz provide data for id ");
			Scanner sc = new Scanner(System.in);
			String sName = sc.nextLine();
			Connection db = connectionWithdb();
			PreparedStatement pst = db.prepareStatement("update javaclass set sName = ? where id = 2" );
			pst.setString(1, sName );
			
			pst.executeUpdate();
			
		}
		
		public void delete()throws Exception {
			System.out.println("plz provide data for deletation");
			Scanner sc = new Scanner (System.in);
			int del = sc.nextInt();
			Connection db = connectionWithdb();
			PreparedStatement pst = db.prepareStatement("delete from javaclass where id = ?");
			pst.setInt(1, del);
			pst.executeUpdate();
			
		}
}
				
		
	
	
		 
		
		

	
	
		
	


