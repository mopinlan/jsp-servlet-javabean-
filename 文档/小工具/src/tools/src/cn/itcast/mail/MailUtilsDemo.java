package cn.itcast.mail;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.junit.Test;

public class MailUtilsDemo {
	@Test
	public void fun1() throws MessagingException, IOException {
		// 创建一个Mail类的对象，参数指定发件人和收件人
		Mail mail = new Mail("itcast_cxf@163.com", "itcast_cxf@126.com");
		mail.setSubject("还是测试邮件");//设置主题
		mail.setContent("这是正文，不是垃圾邮件！");//设置正文
		
		// 创建Session对象，需要三个参数：主机名、用户名、密码
		Session session = MailUtils.createSession("smtp.163.com", "itcast_cxf", "itcast");
		// 发邮件，需要session和Mail对象
		MailUtils.send(session, mail);
	}
}
