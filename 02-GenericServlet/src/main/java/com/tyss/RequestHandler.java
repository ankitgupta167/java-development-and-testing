package com.tyss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/read")
public class  RequestHandler extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		String name=req.getParameter("Username");
		String phone=req.getParameter("Userphone");
		String email=req.getParameter("Useremail");
		String password=req.getParameter("Userpassword");
		System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(password);
		
		PrintWriter pw =res.getWriter();
		pw.print(
				"<html>"
				+"<body>"
					+"<h1> ka hal chal ba</head>"
				+"</body>"
					+"<html>"
				);
	}
	
	

}
