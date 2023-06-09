package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CardNumberError {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\OmrBranch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		Select se = new Select(dropstate);
		se.selectByVisibleText("Tamil Nadu");
		WebElement dropcity = driver.findElement(By.id("city"));
		Select s = new Select(dropcity);
		s.selectByVisibleText("Chennai");

		WebElement droproomtype = driver.findElement(By.id("room_type"));
		Select s0 = new Select(droproomtype);
		s0.selectByVisibleText("Standard");
		s0.selectByVisibleText("Deluxe");
		s0.selectByVisibleText("Suite");
		WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		checkin.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement chkindate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]"));
		js.executeScript("arguments[0].click()", chkindate);
		WebElement chkout = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].click()", chkout);
		WebElement checkoutdate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
		js.executeScript("arguments[0].click()", checkoutdate);
		WebElement noofrooms = driver.findElement(By.id("no_rooms"));
		Select s1 = new Select(noofrooms);
		s1.selectByValue("1");
		WebElement noofadult = driver.findElement(By.id("no_adults"));
		Select s2 = new Select(noofadult);
		s2.selectByValue("2");
		WebElement noofchild = driver.findElement(By.id("no_child"));
		noofchild.sendKeys("5");
		driver.switchTo().frame(0);
		WebElement searchbtn = driver.findElement(By.id("searchBtn"));
		searchbtn.click();
		WebElement contnue = driver.findElement(By.xpath("(//a[@class='btn filter_btn'])[1]"));
		contnue.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		WebElement radiobtn1 = driver.findElement(By.id("own"));
		radiobtn1.click();
		WebElement txtdropsalut = driver.findElement(By.id("user_title"));
		Select s3 = new Select(txtdropsalut);
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
		WebElement txtpayment = driver.findElement(By.xpath("//h5[text()='Credit/Debit/ATM Card']"));
		txtpayment.click();
		WebElement dropcardtype = driver.findElement(By.id("payment_type"));
		Select s5 = new Select(dropcardtype);
		s5.selectByValue("debit_card");

		WebElement dropcard = driver.findElement(By.id("card_type"));
		Select s6 = new Select(dropcard);
		s6.selectByVisibleText("Visa");

		WebElement txtcardno = driver.findElement(By.id("card_no"));
		txtcardno.sendKeys("2635532772828829");

		WebElement txtcardname = driver.findElement(By.id("card_name"));
		txtcardname.sendKeys("Bharathi");

		WebElement dropcardmonth = driver.findElement(By.id("card_month"));
		Select s7 = new Select(dropcardmonth);
		s7.selectByValue("11");

		WebElement dropcardyear = driver.findElement(By.id("card_year"));
		Select s8 = new Select(dropcardyear);
		s8.selectByValue("2025");

		WebElement txtcardcvv = driver.findElement(By.id("cvv"));
		txtcardcvv.sendKeys("567");

		WebElement btnsubmit = driver.findElement(By.id("submitBtn"));
		btnsubmit.click();
		WebElement invalidcard = driver.findElement(By.id("invalid-card_no"));
		String text = invalidcard.getText();
		System.out.println(text);

	}

}
