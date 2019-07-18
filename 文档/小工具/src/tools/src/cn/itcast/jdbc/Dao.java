package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class Dao {
	/**
	 * 它不知道是否在事务中！
	 * 如果在事务中，不能关闭！因为事务中可能存在后续方法调用，后续方法还需要使用同一个con
	 * 如果不在事务中，这就必须要关闭！
	 * @param id
	 * @param balance
	 * @throws SQLException
	 */
	public void update(int id, double balance) throws SQLException {
		String sql = "update account set balance=balance+? where id=?";
		QueryRunner qr = new TxQueryRunner();
		qr.update(sql, balance, id);
	}
}
