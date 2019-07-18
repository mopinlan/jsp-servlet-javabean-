package test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import cn.itcast.jdbc.JdbcUtils;

/**
 * 测试JdbcUtils类
 * @author qdmmy6
 *
 */
public class JdbcUtilsTest {
	/**
	 * 通过C3P0连接池获取连接对象
	 * @throws SQLException
	 */
	@Test
	public void testGetConnection() throws SQLException {
		Connection con = JdbcUtils.getConnection();//获取连接
		System.out.println(con);
		JdbcUtils.releaseConnection(con);//如果参数con不是当前线程的连接对象，那么关闭之
	}
	
	/**
	 * 当开始事务后，调用getConnection()会为当前线程创建Connection，而且多次调用getConnection()返回的是同一个对象
	 * @throws SQLException 
	 */
	@Test
	public void testTansaction() throws SQLException {
		JdbcUtils.beginTransaction();//开启事务
		Connection c1 = JdbcUtils.getConnection();//第一次获取当前线程的事务连接对象
		Connection c2 = JdbcUtils.getConnection();//第二次获取当前线程的事务连接对象
		Assert.assertEquals(true, c1 == c2);//比较两次是否相同
		JdbcUtils.commitTransaction();//提交事务
	}
}
