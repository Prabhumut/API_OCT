package com.Zoho.stepdifinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Zoho.runner.RunnerClass;
import com.aventstack.extentreports.utils.FileUtil;
import Base_class.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdifinition extends BaseClass{
	public static WebDriver driver = RunnerClass.driver;
	
	@Given("^user Launch The Web Application$")
	public void user_Launch_The_Web_Application() throws Throwable {
		driver.get("https://www.zoho.com/all-products.html?ireft=ohome");
	}
	@When("^user Click The Free Sign Up Button Navigate To Create Account Page$")
	public void user_Click_The_Free_Sign_Up_Button_Navigate_To_Create_Account_Page() throws Throwable {
		WebElement sign = driver.findElement(By.partialLinkText("Sign up"));
		clickOnElement(sign);
	}
	
	@Given("^user Enter The Email Id In Email Id Field$")
	public void user_Enter_The_Email_Id_In_Email_Id_Field() throws Throwable {
	    WebElement mail = driver.findElement(By.id("emailfield"));
	    userInput(mail, "Mprabhu1912@gmail.com");
	}  

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	    WebElement pass = driver.findElement(By.name("password"));
	    userInput(pass, "19849865");
	}

	@When("^user Enter The Phone Number In Phone Number Field$")
	public void user_Enter_The_Phone_Number_In_Phone_Number_Field() throws Throwable {
	    WebElement mobileNo = driver.findElement(By.name("rmobile"));
	    userInput(mobileNo, "648615463");
	}

	@When("^user Click The I Agree Button$")
	public void user_Click_The_I_Agree_Button() throws Throwable {
		WebElement clkBtn = driver.findElement(By.xpath("//span[@id='signup-termservice']"));
		clickOnElement(clkBtn);
	}
	
	@Then("^user Click The Sign Up Button$")
	public void user_Click_The_Sign_Up_Button() throws Throwable {
	   WebElement signUp = driver.findElement(By.id("signupbtn"));
	  clickOnElement(signUp);
	  
	  TakesScreenshot screenshot = (TakesScreenshot)driver;
	  File sourcefFile = screenshot.getScreenshotAs(OutputType.FILE);
	  
	  File dest = new File("D:\\zoho.png");
	  FileUtils.copyFile(sourcefFile, dest);
	}



}
