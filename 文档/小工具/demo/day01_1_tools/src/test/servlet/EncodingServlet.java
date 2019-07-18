package test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.servlet.BaseServlet;

/**
 * 测试EncodingFilter
 * @author qdmmy6
 *
 */
public class EncodingServlet extends BaseServlet {
	/**
	 * 可以使用POST和GET两种方式请求test()方法！查看输出是否为乱码！
	 */
	public String test(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		System.out.println(name);
		return null;
	}
}
