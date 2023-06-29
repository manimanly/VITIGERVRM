package testng_parcties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_001 {
	@Test
	public void login(String username, String password) {
		System.out.println(username);
		System.out.println(password);

	}
}

/**
 * @Parameters("user")
 * 
 * @Test public void login(String user) { System.out.println("the user name is "
 *       + user);
 * 
 *       }
 * 
 *       }
 */