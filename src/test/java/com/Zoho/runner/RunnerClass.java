package com.Zoho.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base_class.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com.zoho.feature\\zoho.feature" , 
glue = "com.Zoho.stepdifinition",
monochrome = true,
plugin = {"html:Reports/HtmlReport", "pretty", "json:Reports/JsonReport.json",
"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"},
tags = "@smoke")

public class RunnerClass {
	
	public static RemoteWebDriver driver;
	
	@BeforeClass
	
	public static void StepUp() {
		BaseClass.browserLaunch("chrome");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();

	}
	@AfterClass
	public static void teardown() {
		driver.close();
	}

}
