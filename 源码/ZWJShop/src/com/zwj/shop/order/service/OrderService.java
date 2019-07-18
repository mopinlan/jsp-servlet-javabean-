package com.zwj.shop.order.service;

import java.sql.SQLException;

import com.zwj.shop.order.entity.Order;
import com.zwj.shop.page.PageBean;

public interface OrderService {
	// 修改订单状态
	void updateStatus(String oid, int status) throws SQLException;

	// 查询订单状态
	int findStatus(String oid) throws SQLException;

	// 加载订单
	Order load(String oid);

	// 生成订单
	void createOrder(Order order);

	// 我的订单
	PageBean<Order> myOrders(String uid, int pc);

	// 按状态查询
	PageBean<Order> findByStatus(int status, int pc);

	// 查询所有
	PageBean<Order> findAll(int pc);
}
