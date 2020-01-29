package stepDefinitions;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void AbrirNavegador() throws MalformedURLException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

//	@After
//
//	public void finaliza(Scenario scenario) {
//
//		driver.quit();
//
//	}

}
