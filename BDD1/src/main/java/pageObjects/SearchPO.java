package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sun.org.apache.bcel.internal.generic.Select;

public class SearchPO extends BaseClass {
	
	public SearchPO(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "searchDropdownBox")
	public static WebElement CboSearch;

	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	public static WebElement TxtSearch;
	

}