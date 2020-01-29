package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.Search;
import modules.Select;
import pageObjects.SearchPO;
import pageObjects.SelectPO;

public class SearchBook {

	public WebDriver driver;

	public SearchBook() {

		driver = Hooks.driver;
	}

	@Given("^I navegate to \"([^\"]*)\"$")
	public void i_navegate_to(String URL) throws Throwable {
		URL = "https://www.amazon.com";
		driver.get(URL);


	}

	@When("^I select the option “Books” in the dropdown next to the search text input criteria\\.$")
	public void i_select_the_option_Books_in_the_dropdown_next_to_the_search_text_input_criteria() throws Throwable {
		PageFactory.initElements(driver, SearchPO.class);
		PageFactory.initElements(driver, Search.class);
		Search.SelectOption(driver);
	}

	@Then("^I search for “Test automation”\\.$")
	public void i_search_for_Test_automation() throws Throwable {
		PageFactory.initElements(driver, SearchPO.class);
		PageFactory.initElements(driver, Search.class);
		Search.SearchBook(driver);
	}

	@And("^I select the cheapest book of the page without using any sorting method available\\.$")
	public void i_select_the_cheapest_book_of_the_page_without_using_any_sorting_method_available() throws Throwable {
		PageFactory.initElements(driver, SelectPO.class);
		PageFactory.initElements(driver, Select.class);
		Select.SelectBook(driver);
	}

	@When("^I reach the detailed book page, I check if the name in the header is the same name of the book that I select previously\\.$")
	public void i_reach_the_detailed_book_page_I_check_if_the_name_in_the_header_is_the_same_name_of_the_book_that_I_select_previously() throws Throwable {
		PageFactory.initElements(driver, SelectPO.class);
		PageFactory.initElements(driver, Select.class);
		Select.BookVerify(driver);
	}










}
