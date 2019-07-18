package com.zwj.shop.book.dao;



import java.sql.SQLException;
import java.util.List;



import com.zwj.shop.book.entity.Book;
import com.zwj.shop.page.Expression;
import com.zwj.shop.page.PageBean;



public interface BookDao {
	// 删除图书
	void delete(String bid) throws SQLException;
	// 修改图书
	void edit(Book book) throws SQLException;
	// 按bid查询
	Book findByBid(String bid) throws SQLException;
	// 查询指定分类下图书的个数
	int findBookCountByCategory(String cid) throws SQLException;
	//按分类查询
	PageBean<Book> findByCategory(String cid, int pc) throws SQLException;
	// 按书名模糊查询
	PageBean<Book> findByBname(String bname, int pc) throws SQLException;
	//按作者查询
	PageBean<Book> findByAuthor(String author, int pc) throws SQLException;
	//按出版社查询
	PageBean<Book> findByPress(String press, int pc) throws SQLException;
	// 多条件组合查询
	PageBean<Book> findByCombination(Book criteria, int pc) throws SQLException;
	// 通用的查询方法
	PageBean<Book> findByCriteria(List<Expression> exprList, int pc) throws SQLException;
	// 添加图书
	void add(Book book) throws SQLException;
}
