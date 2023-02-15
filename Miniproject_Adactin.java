package com.seleniumvja;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject_Adactin {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	
	driver.findElement(By.id("username")).sendKeys("Anush1Velmurugan");
	driver.findElement(By.id("password")).sendKeys("An1$ha9*");
	driver.findElement(By.id("login")).click();
	
	WebElement loc = driver.findElement(By.id("location"));
	Select l = new Select(loc);
	l.selectByVisibleText("Melbourne");
	
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select h= new Select(hotel);
	h.selectByVisibleText("Hotel Sunshine");
	
	WebElement room = driver.findElement(By.id("room_type"));
	Select r = new Select(room);
	r.selectByValue("Double");
	
	WebElement roomno = driver.findElement(By.id("room_nos"));
	Select rn= new Select(roomno);
	rn.selectByValue("2");
	
	driver.findElement(By.id("datepick_in")).sendKeys("15/02/2023");
	driver.findElement(By.id("datepick_out")).sendKeys("16/02/2023");
	
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select ar= new Select(adult);
	ar.selectByValue("2");
	
	WebElement child = driver.findElement(By.id("child_room"));
	Select cr= new Select(child);
	cr.selectByValue("0");
	
	driver.findElement(By.id("Submit")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();
	
	driver.findElement(By.id("first_name")).sendKeys("Anusha");
	driver.findElement(By.id("last_name")).sendKeys("Velmurugan");
	driver.findElement(By.id("address")).sendKeys("Ariyalur");
	driver.findElement(By.id("cc_num")).sendKeys("1234567887654321");
	
	WebElement ctype = driver.findElement(By.id("cc_type"));
	Select ct= new Select(ctype);
	ct.selectByValue("MAST");
	
	WebElement emonth = driver.findElement(By.id("cc_exp_month"));
	Select em = new Select(emonth);
	em.selectByValue("12");
	
	WebElement eyear = driver.findElement(By.id("cc_exp_year"));
	Select ey= new Select(eyear);
	ey.selectByValue("2022");
	
	driver.findElement(By.id("cc_cvv")).sendKeys("377");
	driver.findElement(By.id("book_now")).click();
	
	//Thread.sleep(4000);
	WebElement my = driver.findElement(By.linkText("Booked Itinerary"));
	my.click();
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Screenshot\\my itinerary.png");
	FileUtils.copyFile(source, destination);
	
	driver.close();
	
}
}
