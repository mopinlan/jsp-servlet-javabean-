package com.zwj.shop.order.dao;



import java.sql.SQLException;

import com.zwj.shop.order.entity.Order;
import com.zwj.shop.page.PageBean;



public interface OrderDao {
//查看订单情况
	int findStatus(String oid) throws SQLException;
//修改订单状态
	void updateStatus(String oid, int status) throws SQLException;
//加载订单
	Order load(String oid) throws SQLException;
//生成订单
	void add(Order order) throws SQLException;
//按用户查询订单
	PageBean<Order> findByUser(String uid, int pc) throws SQLException;
	//查询所有
	PageBean<Order> findAll(int pc) throws SQLException;
	//按状态查询
	PageBean<Order> findByStatus(int status, int pc) throws SQLException;
}
