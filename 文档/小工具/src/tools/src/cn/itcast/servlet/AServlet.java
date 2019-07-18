package cn.itcast.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends BaseServlet {	
	public String add(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("add()...");
		String name = request.getParameter("username");
		System.out.println("name: " + name);
		return "f:/index.jsp";
	}
	public String update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("update()...");
		return "r:/index.jsp";
	}
}
