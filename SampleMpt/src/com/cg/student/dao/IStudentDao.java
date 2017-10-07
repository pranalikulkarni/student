package com.cg.student.dao;

import java.io.IOException;
import java.util.ArrayList;

import com.cg.student.bean.StudentInfo;

public interface IStudentDao {

	int addDetails(StudentInfo info) throws IOException;

	ArrayList<StudentInfo> retrieveDetails() throws IOException;

}
