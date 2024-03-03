package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {

	public WebDriver intializeBrowser(String browserName) throws MalformedURLException {
		
		WebDriver driver;
		
		DesiredCapabilities dCapabilities = new DesiredCapabilities();
		if(browserName.equals("chrome")) {
			
			dCapabilities.setBrowserName("chrome");
		}
		else if (browserName.equals("firefox")) {
			dCapabilities.setBrowserName("firefox");
		}
		
		else if (browserName.equals("edge")) {
			dCapabilities.setBrowserName("MicrosoftEdge");
		}
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444"),dCapabilities);
		
		return driver;
	}
}
