package com.tyss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Generic servlet is triggerd");
		
		PrintWriter pw= res.getWriter();
		pw.print(
				"<html>"
				+"<body>"
						+"<h1> ka hal chal ba re ,te bahuat pad raha hai.</h1>"
				+"</body>"
						+"<html>"
				
				);
	}
}
