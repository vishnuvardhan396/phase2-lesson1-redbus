package redbus.qa.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBusPage {
	@FindBy(id = "src")
	private WebElement fromLocation;
	@FindBy(id = "dest")
	private WebElement toLocation;
	@FindBy(className = "dateText")
	private WebElement date;
	@FindBy(xpath = "(//span[normalize-space()='26'])")
	private WebElement selectDate;
	@FindBy(id = "search_button")
	private WebElement clickSearch;

	public SearchBusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickFrom(String from) {
		fromLocation.sendKeys(from);
	}

	public void clickTo(String to) {
		toLocation.sendKeys(to);
	}

	public void clickDate() {
		date.click();
	}

	public void selectDateFromCalendar() {
		selectDate.click();
	}

	public void searchBuses() {
		clickSearch.click();
	}
}
