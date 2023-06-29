package testng_parcties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelHandle {
	@Test
	public void read() throws IOException {
		String path = "C:\\Users\\Manikanta\\OneDrive\\Desktop//MS EXCEL.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("data1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cel = row.getCell(0);
		String data = cel.getStringCellValue();
		System.out.println("the String valu====>" + data);

		System.out.println("--------------------------------");

	}

}
