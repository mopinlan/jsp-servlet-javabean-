package test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.servlet.BaseServlet;

public class AServlet extends BaseServlet {
	/**
	 * 请求处理方法的参数都与doGet()和doPost()相同，即request和response
	 * 但请求处理方法有String类型的返回值，而doGet()和doPost()没有返回值。
	 * 在请求本方法时需要给出method=regist参数！
	 */
	public String regist(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("AServlet regist()...");
		return "f:/index.jsp";
	}
	
	/**
	 * 在请求本方法时需要给出method=login参数！
	 */
	public String login(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("AServlet login()...");
		return "r:/index.jsp";
	}
}
