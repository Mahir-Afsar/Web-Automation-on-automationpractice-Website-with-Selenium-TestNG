package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_002_SignInPage extends CommonMethods{
	WebDriver driver = null;
	
	public PO_002_SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email_create")
	public WebElement emailInputField;
	
	@FindBy(id = "SubmitCreate")
	public WebElement createAccountButton;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailLoginField;
	
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement passwordLoginField;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	public WebElement SubmitLoginField;
	
	public String signInPageTitle = "Login - My Store";
	
	@Step("Create An Account With Email")
	public void createAccountWithEmail(String email) {
		sendText(emailInputField, email);
		createAccountButton.click();
	}
	
	@Step("Login With Email And Password")
	public void loginWithEmailAndPassword(String email, String password) {
		sendText(emailLoginField, email);
		sendText(passwordLoginField, password);
		clickElement(driver, SubmitLoginField);
	}

}
