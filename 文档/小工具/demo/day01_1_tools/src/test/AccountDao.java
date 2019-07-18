package test;

import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.itcast.jdbc.TxQueryRunner;

/**
 * AccountDao
 * @author qdmmy6
 * 封装了对Account对应数据库表的增、删、改、查操作
 */
public class AccountDao {
	private TxQueryRunner qr = new TxQueryRunner();
	/**
	 * 通过name查询账户
	 * @param name
	 * @return
	 * @throws SQLException 
	 */
	public Account findAccountByName(String name) throws SQLException {
		String sql = "select * from account where name=?";
		return qr.query(sql, new BeanHandler<Account>(Account.class), name);
	}
	
	/**
	 * 修改账户
	 * @param account
	 * @throws SQLException 
	 */
	public void update(Account account) throws SQLException {
		String sql = "update account set balance=? where name=?";
		qr.update(sql, account.getBalance(), account.getName());
	}
}
