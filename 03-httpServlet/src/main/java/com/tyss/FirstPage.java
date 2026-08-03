package com.tyss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class FirstPage extends HttpServlet {
	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
     String ur=   req.getParameter("Username");
     System.out.println(ur);
     
     PrintWriter pw =resp.getWriter();
		pw.print(
				"<html>"
				+"<body>"
					+"<h1> ka hal chal ba</head>"
				+"</body>"
					+"<html>"
				);

	}
	

}
