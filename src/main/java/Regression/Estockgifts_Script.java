package Regression;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Basetest;

public class Estockgifts_Script extends Basetest{
	@Test(groups={"Regression"})
	public static void Click() throws IOException, InterruptedException {
		
		// To read The Property File 
		Properties prop=new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
		prop.load(ip)
;

		
		
		launchBrowser(prop.getProperty("Browser"));
		
		driver.navigate().to("https://qaupgrade.estockgifts.com/");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();
		//click(CustomGiftcard);
		
		System.out.println("opened");
	    WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Event)));
		 sendValue(Event, prop.getProperty("EventName"));
		 

		
		
		
	}
}



