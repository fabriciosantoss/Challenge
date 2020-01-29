package modules;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import pageObjects.SearchPO;

public class Search {

	public static void SelectOption(WebDriver driver) throws Exception {
		Select AllOptions = new Select(SearchPO.CboSearch);
		AllOptions.selectByVisibleText("Books");
	}
	
	public static void SearchBook(WebDriver driver) throws Exception {
		SearchPO.TxtSearch.sendKeys("Test Automation");
		SearchPO.TxtSearch.submit();
	}
}
