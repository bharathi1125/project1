package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OmrHotelbooking {

	public static void main(String[] args) {
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
      
//      WebElement clkroomtype1 = driver.findElement(By.xpath("//textarea[@type='search']"));
//      clkroomtype1.click();
//      WebElement clkstd = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
//      clkstd.click();
//      WebElement clkroomtype2 = driver.findElement(By.xpath("//textarea[@type='search']"));
//      clkroomtype2.click();
//      WebElement clkdelx= driver.findElement(By.xpath("(//li[@role='option'])[2]"));
//      clkdelx.click();
//      WebElement clkroomtype3 = driver.findElement(By.xpath("//textarea[@type='search']"));
//      clkroomtype3.click();
//      WebElement clksuite = driver.findElement(By.xpath("(//li[@role='option'])[3]"));
////      clksuite.click();
      WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
      checkin.click();
      WebElement chkindate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]"));
      chkindate.click();
      WebElement chkout = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
      chkout.click();
      WebElement checkoutdate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
      checkoutdate.click();
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
      WebElement contnue= driver.findElement(By.xpath("(//a[@class='btn filter_btn'])[1]"));
      contnue.click();
      Alert al=driver.switchTo().alert();
      al.accept();
      WebElement radiobtn1 = driver.findElement(By.id("own"));
      radiobtn1.click();
      WebElement txtdropsalut = driver.findElement(By.id("user_title"));
      Select s3=new Select(txtdropsalut);
      s3.selectByValue("Mr");
      WebElement txtfirst = driver.findElement(By.id("first_name"));
      txtfirst.sendKeys("Bharathi");
      
      WebElement txtlast = driver.findElement(By.id("last_name"));
      txtlast.sendKeys("Raja");
      
      WebElement txtphone = driver.findElement(By.id("user_phone"));
      txtphone.sendKeys("9944062934");
      
      WebElement txtemail = driver.findElement(By.id("user_email"));
      txtemail.sendKeys("bharathirajatg@gmail.com");
      
      WebElement btnnext = driver.findElement(By.id("step1next"));
      btnnext.click();
      
      WebElement radiobtnbed = driver.findElement(By.id("bed"));
      radiobtnbed.click();
      
      WebElement txrequest = driver.findElement(By.id("other_request"));
      txrequest.sendKeys("No Need");
      
      WebElement btnnext1 = driver.findElement(By.id("step2next"));
      btnnext1.click();
      
      
//      WebElement txtpayment = driver.findElement(By.xpath("//h5[text()='Credit/Debit/ATM Card']"));
//      txtpayment.click();
//      WebElement dropcardtype = driver.findElement(By.id("payment_type"));
//      Select s5=new Select(dropcardtype);
//      s5.selectByValue("debit_card");
//      
//      WebElement dropcard= driver.findElement(By.id("card_type"));
//      Select s6=new Select(dropcard);
//      s6.selectByValue("Visa");
//      
//      WebElement txtcardno = driver.findElement(By.id("card_no"));
//      txtcardno.sendKeys("");
//      
//      WebElement txtcardname = driver.findElement(By.id("card_no"));
//      txtcardname.sendKeys("");
//      
//      WebElement dropcardmonth= driver.findElement(By.id("card_type"));
//      Select s7=new Select(dropcardmonth);
//      s7.selectByValue("11");
//      
//      WebElement dropcardyear= driver.findElement(By.id("card_year"));
//      Select s8=new Select(dropcardyear);
//      s8.selectByValue("2025");
//      
//      WebElement txtcardcvv = driver.findElement(By.id("cvv"));
//      txtcardcvv.sendKeys("");
//      
//      WebElement btnsubmit = driver.findElement(By.id("submitBtn"));
//      btnsubmit.click();
//      
      
      
      
      
      
      
      
      
      
      
      
      
      
    
      
      
      
      
      
      
      
	}

}
