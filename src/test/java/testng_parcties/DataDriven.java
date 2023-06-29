package testng_parcties;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	@Test(dataProvider = "data", priority = 0)
	public void test(String user, String pass) {
		System.out.print(user + "--->");
		System.out.println(pass);
		System.out.println("im the boss");

	}

	@Test(priority = 1, dataProvider = "data")
	public void selenium(String user, String pass) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@id='email'")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='pass'")).sendKeys(pass);

	}

	@DataProvider(name = "data")
	public String[][] getdata() throws IOException {
		String path = "C:\\Users\\Manikanta\\OneDrive\\Desktop//MS EXCEL.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("data2");
		int rows = sheet.getLastRowNum();
System.out.println(rows);
		XSSFRow row = sheet.getRow(1);
		int cell = row.getLastCellNum();
		String value[][] = new String[rows][cell];
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cell; j++) {
				value[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();

			}

		}

		return value;

	}
}
