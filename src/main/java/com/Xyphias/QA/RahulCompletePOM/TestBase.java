package com.Xyphias.QA.RahulCompletePOM;



import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestUtil.Util;

public class TestBase {
	
	public static Properties prop;
	

	
public static  WebDriver driver;
	
	
	
	public TestBase(){
		try {
		prop = new Properties();
		
		
		
		FileInputStream file = new FileInputStream("D:\\Eclipse Workspace\\RahulCompletePOM\\src\\main\\java\\configproperties\\objectrepository.properties");
		
		prop.load(file) ;
	
	}
		
		catch(Exception e ) {
			
			System.out.println(e);
		}

}



        public static void initialization() {
        	
        	 String BrowserName = prop.getProperty("Browser");
        	
        	if(BrowserName.equals("chrome")) {
        		
        		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver for version 74\\chromedriver.exe");
        		
        		
        		driver = new ChromeDriver();
        	}
        	
        	else if(BrowserName.equals("firefox")) {
        		
        		System.setProperty("webdriver.gecko.driver", "D:\\Geckodriver\\geckodriver.exe");
        		
        		
        		driver = new FirefoxDriver();
        		
}
        	
        	driver.get(prop.getProperty("URL"));
        	
        	driver.manage().window().maximize();
        	
        	//driver.manage().timeouts().pageLoadTimeout(Util.IMPLICITLY_WAIT, TimeUnit.SECONDS);
        	
        	//driver.manage().timeouts().implicitlyWait(Util.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
        	
        	//public static long IMPLICITLY_WAIT = 30 ;
        	//public static long PAGELOAD_TIMEOUT = 30 ;
        	
        }
        
}
