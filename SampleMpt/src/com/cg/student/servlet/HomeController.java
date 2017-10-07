package com.cg.student.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




import com.cg.student.bean.StudentInfo;
import com.cg.student.service.IStudentService;
import com.cg.student.service.StudentServiceImpl;


@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentInfo info=new StudentInfo();
		IStudentService service=new StudentServiceImpl();
		String path=request.getServletPath();
		String target=null;
		HttpSession session=request.getSession();
	
		switch(path)
		{
		/*case "/add.obj" :
			
			target="NewStudent.jsp";
			break;
			
		case "/insert.obj" :
			
			String name=request.getParameter("studname");
			
			String age=request.getParameter("age");
			int studage=Integer.parseInt(age);
			
			String state=request.getParameter("state");
			
			String gender=request.getParameter("gender");
			
			String centum=request.getParameter("score");
			int subscore=Integer.parseInt(centum);
			
			String attempts=request.getParameter("attempts");
			int noattempts=Integer.parseInt(attempts);
			
			String total=request.getParameter("total");
			int totalscore=Integer.parseInt(total);
			
			info.setStudName(name);
			info.setAge(age);
			info.setCountry(state);
			info.setGender(gender);
			info.setCentum(centum);
			info.setAttempts(attempts);
			info.setTotal(total);
			
			int res=service.addDetails(info);
			if(res==1)
			{
				target="Success.jsp";
			}
			else
			{
				target="index.jsp";
			}
			
			break;
			
		case "/retrieve.obj" :
			ArrayList<StudentInfo> list = service.retrieveDetails();
			session.setAttribute("list", list);
			
			target="StudentScore.jsp";
			
			break;
		
		case "/new.obj" :
			
			target="NewStudent.jsp";
			break;
		
		
		}*/
		
		case "/retrieve.obj" :
			
			ArrayList<StudentInfo> list = service.retrieveDetails();
			session.setAttribute("list", list);
			
			target="StudentScore.jsp";
			
			break;
		
		case "/new.obj" :
			
			
			target="NewStudent.jsp";
			break;
			
		case "/insert.obj" :
			
			String name=request.getParameter("studname");
			
			String age=request.getParameter("age");
			int studage=Integer.parseInt(age);
			
			String state=request.getParameter("state");
			
			String gender=request.getParameter("gender");
			
			String centum=request.getParameter("score");
			int subscore=Integer.parseInt(centum);
			
			String attempts=request.getParameter("attempts");
			int noattempts=Integer.parseInt(attempts);
			
			String total=request.getParameter("total");
			int totalscore=Integer.parseInt(total);
			
			info.setStudName(name);
			info.setAge(age);
			info.setCountry(state);
			info.setGender(gender);
			info.setCentum(centum);
			info.setAttempts(attempts);
			info.setTotal(total);
			
			int res=service.addDetails(info);
			if(res==1)
			{
				target="Success.jsp";
			}
			else
			{
				target="index.jsp";
			}
			
			break;
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

	
}
