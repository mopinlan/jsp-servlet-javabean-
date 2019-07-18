package cn.itcast.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import cn.itcast.jdbc.JdbcUtils;

public class Demo1 {
	//33753(使用了预编译)370627, 1891916
	//37321(没使用预编译)367044
	//168(使用了预编译和批处理)
	//
	@Test
	public void fun1() throws SQLException {
		Connection con = JdbcUtils.getConnection();
		String sql = "insert into user values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		for(int i = 1; i <= 50000; i++) {
			pstmt.setInt(1, i);
			pstmt.setString(2, "user_" + i);
			pstmt.setString(3, "123");
			pstmt.addBatch();
		}
		long begin = System.currentTimeMillis();
		pstmt.executeBatch();
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
		pstmt.close();
		con.close();
	}
}
