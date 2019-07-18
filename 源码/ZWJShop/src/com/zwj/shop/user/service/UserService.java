package com.zwj.shop.user.service;

import java.sql.SQLException;

import cn.itcast.commons.CommonUtils;

import com.zwj.shop.user.dao.UserDao;
import com.zwj.shop.user.dao.daoImpl.UserDaoImpl;
import com.zwj.shop.user.entity.User;
import com.zwj.shop.user.service.exception.UserException;



public class UserService {
	UserDao userdao=new UserDaoImpl();
	public void updatePassword(String uid, String newPass, String oldPass) throws UserException {

		try {
			/*
			 * 1. 校验老密码
			 */
			boolean bool = userdao.findByUidAndPassword(uid, oldPass);
			if(!bool) {//如果老密码错误
				throw new UserException("老密码错误！");
			}
			
			/*
			 * 2. 修改密码
			 */
			userdao.updatePassword(uid, newPass);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//用户名注册校验
	public boolean ajaxValidateLoginname(String loginname) {
		try {
			return userdao.ajaxValidateLoginname(loginname);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//Email校验
	public boolean ajaxValidateEmail(String email) {
		try {
			return userdao.ajaxValidateEmail(email);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 登录功能
	 * @param user
	 * @return
	 */
	public User login(User user) {
		try {
			return userdao.findByLoginnameAndLoginpass(user.getLoginname(), user.getLoginpass());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void regist(User user) {
		/*
		 * 1. 数据的补齐
		 */
		user.setUid(CommonUtils.uuid());
		user.setStatus(false);
		user.setActivationCode(CommonUtils.uuid() + CommonUtils.uuid());
		/*
		 * 2. 向数据库插入
		 */
		try {
			userdao.add(user);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
}
	}
