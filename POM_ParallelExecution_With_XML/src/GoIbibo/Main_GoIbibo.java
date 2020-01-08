package GoIbibo;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_GoIbibo {
	WebDriver driver;
	@Test
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Preeti\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Hello");
	}

}
