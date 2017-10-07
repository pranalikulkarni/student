package com.cg.student.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.sql.Statement;
import java.util.ArrayList;



import com.cg.student.bean.StudentInfo;
import com.cg.student.service.IStudentService;
import com.cg.student.util.DButil;

public class StudentDaoImpl implements IStudentDao
{
	Connection con=null;
	@Override
	public int addDetails(StudentInfo info) throws IOException {
		
		int result=0;
		try
		{
			con=DButil.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into Student_score values(stud_id_seq.nextval,?,?,?,?,?,?,?)");
			ps.setString(1, info.getStudName());
			ps.setString(2, info.getAge());
			ps.setString(3, info.getGender());
			ps.setString(4, info.getCountry());
			ps.setString(5, info.getCentum());
			ps.setString(6, info.getAttempts());
			ps.setString(7, info.getTotal());
			result=ps.executeUpdate();
			/*PreparedStatement pst=con.prepareStatement("select stud_id_seq.currval from dual");
		    ResultSet rs=pst.executeQuery();
		    
		    while(rs.next())
		    {
		    	result=rs.getInt(1);
		    }
			*/
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public ArrayList<StudentInfo> retrieveDetails() throws IOException {
		
		ArrayList<StudentInfo> list =new ArrayList<StudentInfo>();
		try{
			
		con=DButil.getConnection();
		String sql="Select * from Student_score";
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			int sid=rs.getInt(1);
			String sname=rs.getString(2);
			String sage=rs.getString(3);
			String scountry=rs.getString(4);
			String sgender=rs.getString(5);
			String scentum=rs.getString(6);
			String sattempt=rs.getString(7);
			String stotal=rs.getString(8);
			
			
			list.add(new StudentInfo(sid,sname,sage,scountry,sgender,scentum,sattempt,stotal));
		}
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
		
	}
	}
	


