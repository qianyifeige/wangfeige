package one;
import static org.junit.Assert.assertTrue;
import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testBaiDu {
	public WebDriver driver;
	String str="http://www.baidu.com";
	@Test
    public  void testbaiduSearch() {
    	
    	WebElement inputBox=driver.findElement(By.id("kw"));
        Assert.assertTrue(inputBox.isDisplayed());
        inputBox.sendKeys("CSDN");
        driver.findElement(By.id("su")).click();
    }
    @Before
    public void beforeMethod() {
    	System.setProperty("webdriver.firebox.bin","C:\\\\Program Files (x86)\\\\Mozilla Firefox\\\\firefox.exe");
    	driver=new FirefoxDriver();
    	driver.get(str);		    			
    }
	
	@After 
	public void afterMethod(){ 
		  driver.quit(); 
		  
	}
	 
}
