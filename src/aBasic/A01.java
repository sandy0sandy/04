package aBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A01 {
	
	public static void main (String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandy\\Documents\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
//	ChromeDriver d=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/");
	
	driver.findElement(By.name("userName")).sendKeys("sandy0sandy");
	driver.findElement(By.name("password")).sendKeys("Ss@9403484218");
	
	driver.findElement(By.name("submit")).click();
	
	driver.getTitle();
	
	Thread.sleep(5000);
	
	System.out.println("Successfull lounch");
	
	driver.close();
	
	}
	
}