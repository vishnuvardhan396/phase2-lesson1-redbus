package redbus.qa.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

//WebDriver driver;

//create pagefactory
@FindBy(xpath = "//span[text()='Account']")
WebElement myaccount;

@FindBy(xpath = "//span[text()='Login/ Sign Up']")
WebElement signup;

@FindBy(id="cab_rental_vertical")
WebElement cabRental;

@FindBy(id="rail_tickets_vertical")
WebElement TrainTickets;

public HomePage(WebDriver driver) {

PageFactory.initElements(driver, this);


}
//Actions

public void clickOnMyAccount() {

myaccount.click();
	
}

public void clickOnSignup() {
signup.click();
}


public void clickOnCabRental() {
cabRental.click();
}

public void clickOntrainTicket() {
TrainTickets.click();
}

}

