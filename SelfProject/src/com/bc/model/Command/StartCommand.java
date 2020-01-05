package com.bc.model.Command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.model.dao.MapDAO;
import com.bc.model.vo.AddrVO;

public class StartCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MapDAO dao = new MapDAO();
		
		List<AddrVO> list = dao.getDoList();
		request.setAttribute("doList", list);
		
		return "mapIndex.jsp";
	}

}
