package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingError {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\OmrBranch\\driver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.omrbranch.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	      WebElement txtusername = driver.findElement(By.id("email"));
	      txtusername.sendKeys("bharathirajatg@gmail.com");
	      WebElement txtpassword = driver.findElement(By.id("pass"));
	      txtpassword.sendKeys("Bharu@1231");
	      WebElement btnlogin = driver.findElement(By.xpath("//*[@id=\"userLogin\"]/div[5]/button"));
	      btnlogin.click();
	      driver.switchTo().frame("hotelsearch_iframe");
	      
	      WebElement searchbtn = driver.findElement(By.id("searchBtn"));
	      searchbtn.click();
	      driver.switchTo().defaultContent();
	      WebElement txtstate = driver.findElement(By.id("invalid-state"));
	      String text = txtstate.getText();
	      System.out.println(text);
	      WebElement txtcity = driver.findElement(By.id("invalid-city"));
	      String text2 = txtcity.getText();
	      System.out.println(text2);
	      WebElement txtcheckin = driver.findElement(By.id("invalid-check_in"));
	      String text3 = txtcheckin.getText();
	      System.out.println(text3);
	      WebElement txtcheckout = driver.findElement(By.id("invalid-check_out"));
	      String text4 = txtcheckout.getText();
	      System.out.println(text4);
	      WebElement txtinvalidroom = driver.findElement(By.id("invalid-no_rooms"));
	      String text5 = txtinvalidroom.getText();
	      System.out.println(text5);
	      WebElement txtinvalidadult = driver.findElement(By.id("invalid-no_adults"));
	      String text6 = txtinvalidadult.getText();
	      System.out.println(text6);

	}

}
