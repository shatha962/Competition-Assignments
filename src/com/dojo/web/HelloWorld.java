package com.dojo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName =request.getParameter("name");
		String language =request.getParameter("lang");

		String hometown =request.getParameter("home");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(userName == null ) {
			userName ="Unknown";
		}
		if(language == null) {
			language ="Unknown";
		}
		if(hometown == null) {
			hometown ="Unknown";
		}
        out.write("<h1>Welcome, "+userName+"</h1>");
        out.write("<h1>Your favorite language is"+"\t"+language+"</h1>");
        out.write("<h1>Your Home town is"+"\t"+hometown+"</h1>");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
