package com.bc.model.Command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

	public String exec(HttpServletRequest request,
			HttpServletResponse response) 
	throws ServletException, IOException;
// 인터페이스니까 구현부는 없고 선언문만 있다
	
}