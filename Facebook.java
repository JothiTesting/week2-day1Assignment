package week2.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
						WebDriverManager.chromedriver().setup();
						ChromeDriver driver = new ChromeDriver();
						driver.manage().window().maximize();
						driver.get("https://en-gb.facebook.com/");
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						driver.findElement(By.linkText("Create New Account")).click();
						driver.findElementByName("firstname").sendKeys("Jothi");
						driver.findElementByName("lastname").sendKeys("Periannan");
						driver.findElementByName("reg_email__").sendKeys("jothipriyayes@gmail.com");
						driver.findElementByName("reg_passwd__").sendKeys("Kavi@999");
						WebElement drop1=driver.findElement(By.id("day"));
						Select dropdwn1=new Select(drop1);
						dropdwn1.selectByValue("10");
						WebElement drop2=driver.findElement(By.id("month"));
						Select dropdwn2=new Select(drop2);
						dropdwn2.selectByValue("2");
						WebElement drop3=driver.findElement(By.id("year"));
						Select dropdwn3=new Select(drop3);
						dropdwn3.selectByVisibleText("2000");
					
							
			}
		
	}


