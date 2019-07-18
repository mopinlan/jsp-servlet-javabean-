package com.zwj.shop.category.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.zwj.shop.category.entity.Category;



public interface CategoryDao {
	//把一个map映射到实体类中
	Category toCategory(Map<String,Object> map);
	//可以把多个Map(List<Map>)映射成多个Category(List<Category>)
	List<Category> toCategoryList(List<Map<String,Object>> mapList);
	// 返回所有分类
	List<Category> findAll() throws SQLException;
	// 通过父分类查询子分类
	List<Category> findByParent(String pid) throws SQLException;
	//添加分类
	void add(Category category) throws SQLException;
	//获取所有父分类，但不带子分类的！
	List<Category> findParents() throws SQLException;
	//加载分类 即可加载一级分类，也可加载二级分类
	Category load(String cid) throws SQLException;
	//修改分类
	void edit(Category category) throws SQLException;
	//查询指定父分类下子分类的个数
	int findChildrenCountByParent(String pid) throws SQLException;
	//删除分类
	void delete(String cid) throws SQLException;
}
