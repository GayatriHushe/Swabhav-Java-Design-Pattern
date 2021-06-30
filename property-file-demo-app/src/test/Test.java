package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException  {
		FileReader f1=new FileReader("D:\\java swabhav design pattern\\property-file-demo-app\\src\\resources\\credentials.properties");
		Properties p=new Properties();
		p.load(f1);
		
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}

}
