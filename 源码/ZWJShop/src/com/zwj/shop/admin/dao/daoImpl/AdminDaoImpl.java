package com.zwj.shop.admin.dao.daoImpl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.itcast.jdbc.TxQueryRunner;

import com.zwj.shop.admin.dao.AdminDao;
import com.zwj.shop.admin.entity.Admin;

public class AdminDaoImpl implements AdminDao {
	private QueryRunner qr = new TxQueryRunner();
	
		public Admin find(String adminname, String adminpwd) throws SQLException {
			String sql = "select * from t_admin where adminname=? and adminpwd=?";
			return qr.query(sql, new BeanHandler<Admin>(Admin.class), adminname, adminpwd);
	
	}

}
