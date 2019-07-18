package test;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.junit.Test;

import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;

public class MailUtilsTest {
	/**
	 * 测试发送普通邮件
	 * @throws IOException 
	 * @throws MessagingException 
	 */
	@Test
	public void fun() throws MessagingException, IOException {
		Session session = MailUtils.createSession("smtp.163.com", "itcast_cxf", "itcastitcast");
		Mail mail = new Mail("itcast_cxf@163.com", "itcast_cxf@126.com", "测试MailUtils", "这是正文！");
		MailUtils.send(session, mail);
	}
}
