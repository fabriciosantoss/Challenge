package pageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sun.org.apache.bcel.internal.generic.Select;

public class SelectPO extends BaseClass {
	
	public SelectPO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//a[@class='a-link-normal a-text-normal']//span[contains(text(), \"Test Automation in the Real World\")]")
	public static WebElement LnkBook;	
	
	@FindBy(how = How.ID, using = "ebooksProductTitle")
	public static WebElement BookName;	
	
	public static void rollDown(int x) {
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0," + x + ")");
	}
}