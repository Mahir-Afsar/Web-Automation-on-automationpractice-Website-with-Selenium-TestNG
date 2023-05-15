package testCasesPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basePackage.DriverSetup;
import io.qameta.allure.Description;
import pageObjectPackage.PO_001_HomePage;
import pageObjectPackage.PO_002_SignInPage;
import pageObjectPackage.PO_003_CreateAnAccountPage;
import pageObjectPackage.PO_004_MyAccountPage;
import testDataPackage.DataSet;

public class TC001_CreateNewAccount extends DriverSetup{
	@Test(description = "Perform registration for new users and Sign out",dataProvider = "registrationData",dataProviderClass = DataSet.class)
	@Description("Test Description: This test will go to automationpractice.com and "
			+ "browse to the registration page. Then complete the registration process "
			+ "by providing new user Personal. " + "Finally, sign out from the system.")
	public static void registration(String email, String firstName, String lastName, String password, String day, String month, String year){
		
		PO_001_HomePage homePage = new PO_001_HomePage(driver);
		PO_002_SignInPage signInPage = new PO_002_SignInPage(driver);
		PO_003_CreateAnAccountPage register = new PO_003_CreateAnAccountPage(driver);
		PO_004_MyAccountPage myAccount = new PO_004_MyAccountPage(driver);
		SoftAssert softAssert = new SoftAssert();
		
		//Click on sign in page
		homePage.clickSignInButton();
		
		//Assertion of sign in page Title
		softAssert.assertEquals(signInPage.getTitle(driver), signInPage.signInPageTitle);
		
		//Create a New Account with email
		signInPage.createAccountWithEmail(email);
		
		//Assertion of sub heading text
		softAssert.assertEquals(register.pageSubHeading.getText(), register.pageSubHeadingText);
		
		//provide new user personal information
		register.fillPersonalInformation(firstName, lastName, password, day, month, year);
		
		// click on register button
		register.clickOnRegisterButton();
		
		//Assertion of My Account Page
		String fullName = firstName + " " + lastName;
		softAssert.assertEquals(myAccount.userName.getText(), fullName);
		
		//log out
		myAccount.signoutButton();
		
		// Assert all
		softAssert.assertAll();
	}
	
}
