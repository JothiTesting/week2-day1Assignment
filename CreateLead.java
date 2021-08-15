package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
	// driver.close();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();	
		 driver.findElement(By.linkText("Leads")).click();
		 
		 driver.findElement(By.linkText("Create Lead" )).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jothipriya");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Periannan");
		 //driver.findElement()
		 	//	+ "
	 WebElement drop1=driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select dropdown1=new Select(drop1);
		dropdown1.selectByIndex(1);
		
		 
		 WebElement drop2=driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select dropdown2=new Select(drop2);
			dropdown2.selectByVisibleText("Computer Software");
			
			 WebElement drop3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			 Select dropdown3=new Select(drop3);
				dropdown3.selectByValue("1");

	};

}
