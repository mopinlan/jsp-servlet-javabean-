package com.zwj.shop.user.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.zwj.shop.user.entity.User;


import cn.itcast.jdbc.TxQueryRunner;

/**
 * 用户模块持久层
 * @author qdmmy6
 *
 */
public interface UserDao {
	
	
	/**
	 * 按uid和password查询
	 * @param uid
	 * @param password
	 * @return
	 * @throws SQLException 
	 * @throws SQLException 
	 */
	 boolean findByUidAndPassword(String uid, String password) throws SQLException;
		
	
	/**
	 * 修改密码
	 * @param uid
	 * @param password
	 * @throws SQLException
	 */
	 void updatePassword(String uid, String password) throws SQLException;
	
	/**
	 * 按用户名和密码查询
	 * @param loginname
	 * @param loginpass
	 * @return
	 * @throws SQLException 
	 */
	 User findByLoginnameAndLoginpass(String loginname, String loginpass) throws SQLException;
	
	//通过激活码查询用户
	 User findByCode(String code) throws SQLException;
	 //修改用户状态
	 void updateStatus(String uid, boolean status) throws SQLException;
	 //校验用户名是否注册
	 boolean ajaxValidateLoginname(String loginname) throws SQLException;
	 //校验Email是否注册
	 boolean ajaxValidateEmail(String email) throws SQLException;
	
	
	
	/**
	 * 添加用户
	 * @param user
	 * @throws SQLException 
	 */
	 void add(User user) throws SQLException ;
		
}
