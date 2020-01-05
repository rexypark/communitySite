package com.bc.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bc.model.vo.AddrVO;
import com.bc.mybatis.libs.DBService;

public class MapDAO {

	public List<AddrVO> getStateList(String state) {
		SqlSession ss = DBService.getFactory().openSession(true);
		
		List<AddrVO> list = ss.selectList("stateList",state);
		System.out.println("list : " + list);
		ss.close();
		return list;
	}
	
	public List<AddrVO> getDoList() {
		SqlSession ss = DBService.getFactory().openSession(true);
		
		List<AddrVO> list = ss.selectList("doList");
		System.out.println("list : " + list);
		ss.close();
		return list;
	}
	
	
}
