package aBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class A03 {
	
	public void flipkart() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sandy\\Documents\\geckodriver\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("7588081260");
		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("9403484218");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		driver.findElement(By.xpath("//div[@class=\"eFQ30H\"]//child::a//div//div//img[@alt='Mobiles']")).click();
		driver.findElement(By.xpath("//*[@class='_1aPR5_']")).click();
		driver.findElement(By.xpath("//*[@class='_4rR01T']")).click();
		
		
		
		
//		Thread.sleep(3000);
//		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		A03 ref=new A03 ();
		ref.flipkart();

	}

}
