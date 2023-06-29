package testng_parcties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationInSelenium {
	@Parameters({ "fristname", "lastname" })
	@Test(dataProvider = "set data")
	public void data(String fristname, String lastname) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/register");
		driver.findElement(By.xpath("//input@[id='firstname']")).sendKeys(fristname);
		driver.findElement(By.xpath("//input@[id='lastname']")).sendKeys(lastname);
	}

	@DataProvider(name = "set data")
	public String[][] getdata() {
		String[][] values = { { "valid ", "valid" }, { "invalid", "valid" }, { "valid", "invalid" },
				{ "invalid", "invalid" } };
		return values;

	}
}
