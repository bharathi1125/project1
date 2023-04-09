package org.test;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelPriceAscending {
public static void main(String[] args) throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\OmrBranch\\driver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.omrbranch.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      WebElement txtusername = driver.findElement(By.id("email"));
	      txtusername.sendKeys("bharathirajatg@gmail.com");
	      WebElement txtpassword = driver.findElement(By.id("pass"));
	      txtpassword.sendKeys("Bharu@1231");
	      WebElement btnlogin = driver.findElement(By.xpath("//*[@id=\"userLogin\"]/div[5]/button"));
	      btnlogin.click();
	      WebElement dropstate = driver.findElement(By.name("state"));
	      Select se=new Select(dropstate);
	      se.selectByVisibleText("Tamil Nadu");
	      WebElement dropcity = driver.findElement(By.id("city"));
	      Select s=new Select(dropcity) ;
	      s.selectByVisibleText("Chennai");
	      
	      WebElement droproomtype = driver.findElement(By.id("room_type"));
	      Select s0=new Select(droproomtype);
	      s0.selectByVisibleText("Standard");
	      s0.selectByVisibleText("Deluxe");
	      s0.selectByVisibleText("Suite");
	      WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	      checkin.click();
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      WebElement chkindate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]"));
	      js.executeScript("arguments[0].click()", chkindate);
	      WebElement chkout = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	      js.executeScript("arguments[0].click()",chkout);
	      WebElement checkoutdate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
	      js.executeScript("arguments[0].click()", checkoutdate);
	      WebElement noofrooms = driver.findElement(By.id("no_rooms"));
	      Select s1=new Select(noofrooms);
	      s1.selectByValue("1");
	      WebElement noofadult = driver.findElement(By.id("no_adults"));
	      Select s2=new Select(noofadult);
	      s2.selectByValue("2");
	      WebElement noofchild = driver.findElement(By.id("no_child"));
	      noofchild.sendKeys("5");
	      driver.switchTo().frame(0);
	      WebElement searchbtn = driver.findElement(By.id("searchBtn"));
	      searchbtn.click();
	      WebElement rdobtn = driver.findElement(By.xpath("//label[text()='Price low to high']"));
	      rdobtn.click();
	      Thread.sleep(1000);
	      List<WebElement> pricelow = driver.findElements(By.xpath("//strong[@class='total-prize']"));
	     for (int i = 0; i < pricelow.size(); i++) {
	    	 WebElement hotel = pricelow.get(i);
	    	 String text = hotel.getText();
	    	  System.out.println(text);
	    	 
	    	 
			
		}
	    	  
	    	  
			
		}
}
