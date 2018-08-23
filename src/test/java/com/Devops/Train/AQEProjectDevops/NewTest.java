package com.Devops.Train.AQEProjectDevops;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	private WebDriver oDriver;
  @Test
  public void f() {
	  String text =oDriver.findElement(By.xpath("/html/body")).getCssValue("background-color").toString();
		 
	  System.out.println("Color is"+text);
	  
	  String hex = Color.fromString(text).asHex();
	  System.out.println("--");
	  System.out.println(hex);
	 
	  Assert.assertEquals("##FFA500", hex);
	  //Orange Color #FFA500
	  
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  String sChromeDriverPath ="C:\\Work\\DriverExes\\chromedriver.exe";
	  
	  System.setProperty("webdriver.chrome.driver",sChromeDriverPath);
	  oDriver = new ChromeDriver();
	  
	  System.out.println("Welcome SDET Log");
	  
	  //Code to Call URL--Siddharth.polke@amdocs.com
	  oDriver.get("http://localhost:8081/DemoWebPage/");
	  oDriver.manage().window().maximize();
	  
	  
	  
	  //Valdate Color on this website:- https://www.hexcolortool.com/#000000
	  
	
	 
  }

  @AfterClass
  public void afterClass() {
	  oDriver.quit();
		
		 System.out.println("Exiting Browser-------->");
	  
  }

}
