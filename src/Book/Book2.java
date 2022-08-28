package Book;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
					WebDriver driver= new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					
					//To open the url
					driver.get("https://tide.com/en-us");
					
					
					
					// open how to wash the clothes
					driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[3]/div/div/div/div[3]/a")).click();
					
					//Contact Us
					
					driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div/div[2]/a[2]")).click();
	}

}
