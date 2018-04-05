package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import userbean.userbean;

public class registerdao {

	public static void register(userbean user) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vamsi","vamsi");
			PreparedStatement pstmt=conn.prepareStatement("insert into empdata (username,password,email,id) values(?,?,?,?)");
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setInt(4, user.getId());
			int i=pstmt.executeUpdate();
			if(i==1){
				System.out.println("insert success");
			}else{
				System.out.println("insert not success");
			}
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
