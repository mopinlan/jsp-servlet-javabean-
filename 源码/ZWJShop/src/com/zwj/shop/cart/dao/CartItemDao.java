package com.zwj.shop.cart.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.zwj.shop.cart.entity.CartItem;



public interface CartItemDao {
//加载多个CartItem
	List<CartItem> loadCartItems(String cartItemIds) throws SQLException;
//按id查询
	CartItem findByCartItemId(String cartItemId) throws SQLException;
	//批量删除
	void batchDelete(String cartItemIds) throws SQLException;
	//查询某个用户的某本图书的购物车条目是否存在
	CartItem findByUidAndBid(String uid, String bid) throws SQLException;
	//修改指定条目的数量
	void updateQuantity(String cartItemId, int quantity) throws SQLException;
	//添加条目
	void addCartItem(CartItem cartItem) throws SQLException;
	//把一个Map映射成一个Cartitem
	CartItem toCartItem(Map<String,Object> map);
	// 把多个Map(List<Map>)映射成多个CartItem(List<CartItem>)
	List<CartItem> toCartItemList(List<Map<String,Object>> mapList);
	// 通过用户查询购物车条目
	List<CartItem> findByUser(String uid) throws SQLException;
	
}
