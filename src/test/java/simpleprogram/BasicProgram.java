package simpleprogram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicProgram {
	@Test()
	void v() {
		String Expected_name = "mani";
		String actual_Name = "manly";
		Assert.assertEquals(Expected_name, actual_Name);
		;

	}

	@Test(description = "i am excuting  a", priority = 2, enabled = true, dependsOnMethods = "v")
	public void a() {
		int a = 10;
		System.out.println(a);

	}

	@Test(enabled = false)
	public void b() {

		String name = "manikanta";
		System.out.println(name);
	}

	@Test(priority = 1)
	void c() {
		int number = 908;
		System.out.println(number);
	}
}
