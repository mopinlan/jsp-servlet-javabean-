package test;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;

public class PersonDaoTest {
	@Test
	public void testAdd() throws SQLException {
		Person p1 = new Person(CommonUtils.uuid(), "张三", 18, new Date());
		Person p2 = new Person(CommonUtils.uuid(), "李四", 81, new Date());
		Person p3 = new Person(CommonUtils.uuid(), "王五", 66, new Date());
		
		PersonDao dao = new PersonDao();
		dao.add(p1);
		dao.add(p2);
		dao.add(p3);
	}
	
	@Test
	public void testEdit() throws SQLException {
		PersonDao dao = new PersonDao();
		Person person = dao.load("2F371BE415984DE89781CCCA7B8734CB");
		person.setAge(88);
		dao.edit(person);
	}
	
	@Test
	public void testDelete() throws SQLException {
		PersonDao dao = new PersonDao();
		dao.delete("2F371BE415984DE89781CCCA7B8734CB");
	}
	
	@Test
	public void testFindAll() throws SQLException {
		PersonDao dao = new PersonDao();
		List<Person> list = dao.findAll();
		System.out.println(list);
	}
}
