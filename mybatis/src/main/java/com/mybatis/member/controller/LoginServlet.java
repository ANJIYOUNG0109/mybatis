package com.mybatis.member.controller;

import java.io.IOException;

import com.mybatis.member.vo.Member;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Member m = new Member();
		
		/* 두줄
		String id = request.getParameter("userId");
		m.setUserId(id);	
		*/
		
		String id = request.getParameter("userId");
		m.setUserPwd(request.getParameter("userPwd"));
	}

}
