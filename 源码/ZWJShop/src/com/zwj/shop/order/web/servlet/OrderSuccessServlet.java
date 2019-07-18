package com.zwj.shop.order.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.zwj.shop.order.service.OrderService;
import com.zwj.shop.order.service.serviceImpl.OrderServiceImpl;
import com.zwj.shop.util.AlipayConfig;

public class OrderSuccessServlet extends HttpServlet {
	private OrderService orderService = new OrderServiceImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			orderService.updateStatus(request.getParameter("out_trade_no"), 2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			request.setAttribute("code", "success");
			request.setAttribute("msg", "恭喜，支付成功！");
			request.getRequestDispatcher("../jsps/msg.jsp").forward(request, response);
		 //调用SDK验证签名

		//——请在这里编写您的程序（以下代码仅作参考）——
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
