package testng_parcties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFrompropertiesFile {

	public static void main(String[] args) throws IOException {
		File f = new File("src\\test\\resources\\data.properties");
		FileInputStream fileinput = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fileinput);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("id"));
		
	}

}
