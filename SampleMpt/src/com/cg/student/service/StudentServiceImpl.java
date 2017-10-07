package com.cg.student.service;

import java.io.IOException;
import java.util.ArrayList;


import com.cg.student.bean.StudentInfo;
import com.cg.student.dao.IStudentDao;
import com.cg.student.dao.StudentDaoImpl;

public class StudentServiceImpl implements IStudentService {

	IStudentDao dao=	new StudentDaoImpl();
	@Override
	public int addDetails(StudentInfo info) throws IOException {
	
		
		return dao.addDetails(info);
		
	}
	@Override
	public ArrayList<StudentInfo> retrieveDetails() throws IOException {
		
		
		return dao.retrieveDetails();
	}

}
