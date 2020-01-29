package modules;

import org.openqa.selenium.WebDriver;
import pageObjects.SelectPO;

public class Select {

	public static void SelectBook(WebDriver driver) throws Exception {

		SelectPO.rollDown(1200);
		SelectPO.LnkBook.click();
		
	}
	
	public static void BookVerify(WebDriver driver) throws Exception {
		
		String BookName = SelectPO.BookName.getText();
		driver.getTitle().contentEquals(BookName);
		
	}
	
	

}
