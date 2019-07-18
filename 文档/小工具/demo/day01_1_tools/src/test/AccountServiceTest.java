package test;

import org.junit.Test;

public class AccountServiceTest {
	@Test
	public void testTransfer() {
		AccountService service = new AccountService();
		Account c1 = service.findAccountByName("zs");
		Account c2 = service.findAccountByName("ls");
		service.transfer(c1, c2, 1000);
	}
}
