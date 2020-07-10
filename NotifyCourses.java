package com.students.notification;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.students.ConnectionEstablishment;


public class NotifyCourses {
	public static void getnotifications(String username) throws SQLException {
		Connection connection = new ConnectionEstablishment().createConnection();
		String sql="SELECT * FROM NOTIFICATIONS WHERE username= ?";
		PreparedStatement statement = ((java.sql.Connection) connection).prepareStatement(sql);
	    statement.setString(1, username);
	    statement.executeQuery();
	    ResultSet result = statement.executeQuery();
	    while(result.next()) {
	    	String notify=result.getString("notification");
	    	String s=result.getString("status");
	    	System.out.println(notify+""+s);
	    }
	    result.close();
	    connection.close();
	}
	
}
