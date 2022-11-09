package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	
	public static void addStudentToDB(Student st) {
		
		try {
			Connection con = ConnectionProvider.createC();
			String Query1 = "insert into students(sname,sphone,scity) values (?,?,?)";
			
			PreparedStatement psmt = con.prepareStatement(Query1);
			
			psmt.setString(1, st.getStudentName());
			psmt.setString(2, st.getStudentPhone());
			psmt.setString(3, st.getStudentCity());
		}catch(Exception e) {
			
		}
	}

}
