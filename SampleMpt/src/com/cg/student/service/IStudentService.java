package com.cg.student.service;

import java.io.IOException;
import java.util.ArrayList;

import com.cg.student.bean.StudentInfo;



public interface IStudentService {

	public int addDetails(StudentInfo info) throws IOException;

	public ArrayList<StudentInfo> retrieveDetails() throws IOException;
}
