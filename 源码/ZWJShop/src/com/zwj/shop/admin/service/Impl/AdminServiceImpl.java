package com.zwj.shop.admin.service.Impl;



import java.sql.SQLException;

import com.zwj.shop.admin.dao.AdminDao;
import com.zwj.shop.admin.dao.daoImpl.AdminDaoImpl;
import com.zwj.shop.admin.entity.Admin;
import com.zwj.shop.admin.service.AdminService;


public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao = new AdminDaoImpl();
	public Admin login(Admin admin) {
		try {
			return adminDao.find(admin.getAdminname(), admin.getAdminpwd());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
