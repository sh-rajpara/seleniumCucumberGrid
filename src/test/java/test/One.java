package test;

import java.net.MalformedURLException;
import java.util.concurrent.BrokenBarrierException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.Module.SetupContext;

public class One extends Base {
	public WebDriver driver;
	
	@Test
	public void testone() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
		
	}
	@Before
	public void setup() throws MalformedURLException {
		driver = intializeBrowser("chrome");
	}
	
	@After
	public void teardown() {
		driver.quit();
		
	}

}
