package com.zwj.shop.util;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
		public static String app_id = "2016101100662029";
		
		// 商户私钥，您的PKCS8格式RSA2私钥,官方有密钥生产工具,下载地址在下方
	    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCYM0eihdOYRJ87Hz44d/pypcfx847fZhW5aOHeFn9wVEWt71JnQI2VixDSolz/G6pa0HwnboMj+Qwpq6dcoo8L6T87wQOLPjuMl2sHpCoskx0xvMz4KK/GxSHVWcOCKqLRMj3oWYi9uv2qDwOn1UVqZCRhLan+N1H4gm0xZhyMmwPlqESm5bvy0m8WpTykkOkvqCdmDoVjn0YxxosDnN8+G7PGHf8gQjiNiJo9swgd+14UC9k2WDui193cmS2GNkahE+zNrCFWBiC7+CoetD1/K21DEcj4XUmIHHN1pVFxKH912uWdd2pWy3C0WDL2NzuL13sB4w+RRKgU9DGHgPCRAgMBAAECggEAEe5QrTQJBrJm9ActRGfWKLWhRb8FAQq82nghzBFoeCplfyVn1uRDCfA1Tit0u1VeD47qYZbielV3+lzPvdkk8ylKmtaVfU0apOid4muT0GaQlPCCUWYxt0A4STNnFinBvtWld3883eVuxx83tgkpQWyE4LIJifqofJeZF63JBUN7OgT1/pmu2GRgLlnSbvtXbClBmGAgW3Egsrfqyr9QTh5JDw1piWK5TK+ap93Asvoze6wC7IHmOTQYGlf555VKHEaseYhSH4TChap92D9MAh26KM0XiUZB4fCzRFR4F+HjSqmu4ZYbVtA4gYkoVR0EzdklwLn6nIWzxEIY6dasxQKBgQDcYc/3uxuksD++eqHP76j2WARuLm1EcLc7Ns5EoliMV8hS61EQnPCNYAF/UbsH65E58MdjpEB/zWpensr6k7XtkbtlyfRkR/ramEti1rnZOyMeymetj7COsoKp3J5sgY21aIVln4F26DQuImtabnPeyfMdPFOU/+pmctDu+I1/TwKBgQCwzHv1qwu5wbhen3YnFbrgMRsgpOOkO7OeO5Iz7Emxg3eURNobvrGAOhBk6TyEIok5/fM9Wn7TXwySKL+imWdkLoUZBzS3UvrcOVNWwdsmYeHFDdOTDtPy1DBX79bFOhMKn1J29u6XuWf38XWvtLYivPyM7Jgnj5W6sDvSuWeaHwKBgQDXcTeh8uS/Rx3J1JDDeoMu8DTEkdZ4BcjatmVHa34tFNPdW/ZPy1zOmIBeO0QgJgY/IkeJ/VSgm+vUvF+qPySnLsSIabnlHwj5EdEAuvHMj6dxvmVEoyfzGEfsTqUBZlVmdtuR0TD7UV1RjIxuR3Q25C4q8oKzMsuvg6cFNy78uQKBgQCOB+g5puynkRn1YjOAGLPlMW3ynqSGJrQYlRDSB6v4IH5rLZjumxZrxbmv57OHD1ugrAPBsTabxgsKTBQPox9tWvXv8lsGP3Jqgt8RnnDY999w97eVt17MAGzJ6FJoZUwwx2dvTNbGKtt8U41Q12NOqvZUnClr9qy5qqSUl//DzwKBgQCHw9AwGHneGeif0eLS9nwhjz+gDpHDgnqOUm/0EkMmErLzQCUY01Io1BZjY4DXeBYReY+uw7OvrZeTxKKVBKCZxgZBe3vU3ONAC0J4I5kKLQfRXGcv9uR+8zLzGuEwjfMHJKPCe0ZsgOKSBdyFru4SeRUQpnXQpbaH8qu3eA391Q==";
		
		// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmDNHooXTmESfOx8+OHf6cqXH8fOO32YVuWjh3hZ/cFRFre9SZ0CNlYsQ0qJc/xuqWtB8J26DI/kMKaunXKKPC+k/O8EDiz47jJdrB6QqLJMdMbzM+CivxsUh1VnDgiqi0TI96FmIvbr9qg8Dp9VFamQkYS2p/jdR+IJtMWYcjJsD5ahEpuW78tJvFqU8pJDpL6gnZg6FY59GMcaLA5zfPhuzxh3/IEI4jYiaPbMIHfteFAvZNlg7otfd3JkthjZGoRPszawhVgYgu/gqHrQ9fyttQxHI+F1JiBxzdaVRcSh/ddrlnXdqVstwtFgy9jc7i9d7AeMPkUSoFPQxh4DwkQIDAQAB";

		// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
		public static String notify_url = "http://localhost:8080/NotifyServlet";//为防止未知的异常,后台业务逻辑收到异步通知后执行

		// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
		public static String return_url = "http://rrz7f3.natappfree.cc/ZWJShop/servlet/OrderSuccessServlet";

		// 签名方式
		public static String sign_type = "RSA2";
		
		// 字符编码格式
		public static String charset = "utf-8";
		
		// 支付宝网关,此处注意下,沙箱测试和正式环境,网关是不同的,详情查看官方文档
		public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
		
		// 支付宝网关
		public static String log_path = "C:\\";

	//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	    /** 
	     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	     * @param sWord 要写入日志里的文本内容
	     */
	    public static void logResult(String sWord) {
	        FileWriter writer = null;
	        try {
	            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
	            writer.write(sWord);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (writer != null) {
	                try {
	                    writer.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	}

