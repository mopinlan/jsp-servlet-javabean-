package com.zwj.shop.admin.dao;

import java.sql.SQLException;

import com.zwj.shop.admin.entity.Admin;



public interface AdminDao {
 //通过管理员登录名和登录密码查询
	Admin find(String adminname, String adminpwd) throws SQLException;
}
