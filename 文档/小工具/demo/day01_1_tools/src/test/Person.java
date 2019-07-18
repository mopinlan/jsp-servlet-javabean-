package test;

import java.util.Date;

public class Person {
	private String pid;
	private String name;
	private int age;
	private Date birthday;
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age
				+ ", birthday=" + birthday + "]";
	}
	public Person() {
	}
	public Person(String pid, String name, int age, Date birthday) {
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	
	
}
