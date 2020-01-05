package com.bc.model.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.model.Command.Command;
import com.bc.model.Command.SearchCityCommand;
import com.bc.model.Command.StartCommand;


@WebServlet("/MapClickController")
public class MapClickController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path = "";
		Command comm = null;
		String type = request.getParameter("type");
		System.out.println("type : " + type);
		
		comm = new SearchCityCommand();
		
		
		
		path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
