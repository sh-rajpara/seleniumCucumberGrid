package test;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.Base;

public class Two extends Base {
public WebDriver driver;
	
	@Test
	public void testone() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
		
	}
	@Before
	public void setup() throws MalformedURLException {
		driver = intializeBrowser("edge");
	}
	
	@After
	public void teardown() {
		
		
	}
}
