package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    public LoginPage loginPage;
    public HomePage homePage;

    String standardUsername = "standard_user";
    String password = "secret_sauce";
    String expectedHomepageTitle = "PRODUCTS";
    String expectedLogoutTittle = "Accepted usernames are:";

    String lockedUsername = "locked_out_user";
    String lockedErrorExpectedtext = "Epic sadface: Sorry, this user has been locked out.";

    String errorMessageMissingPassword = "Epic sadface: Password is required";
    String errorMessageMissingUsername = "Epic sadface: Username is required";

    @Test
    public void verifySucessfullLogin(){
        

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(standardUsername, password);
        homePage.verifyAllItemsPage(expectedHomepageTitle);

  
    }

    @Test
    public void verifyBlockedUserUnsucessfullLogin(){
        

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        
    }
loginPage.login(lockedUsername, password);
        loginPage.verifyUnsucessfullLogin(lockedErrorExpectedtext);
    @Test
    public void verifyLoginWithoutUsername(){
        

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        loginPage.login("", password);
        loginPage.verifyUnsucessfullLogin(errorMessageMissingUsername);
    
    }

    @Test
    public void verifyLoginWithoutPassword(){
        

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        loginPage.login(standardUsername, "");
        loginPage.verifyUnsucessfullLogin(errorMessageMissingPassword);
    }

    @Test
    public void verifySucessfullLogout(){
        

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(standardUsername, password);
        homePage.clickOnHamburgerMenu();
        homePage.clickOnLogoutButton();
        loginPage.verifySucessfullLogout();
    }
}





@Test
public void verifySucessfullLogin() {

    homePage = new HomePage(driver);
    MyAccountPage = new MyAccountPage(driver);
    


  
    

    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.login(myUsername, password);
    
}
@Test
public void verifyWrongUsernameUnsucessfullLogin() {
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);

    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.login(wrongMyusername, password);
    loginPage.verifyUnsucessfullLogin(wrongErrorExpectedtext);
}
@Test
 public void verifyLoginWithoutUsername() {
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);

    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.login("", password);
    loginPage.verifyUnsucessfullLogin(errorMessageMissingUsername);
}
@Test
public void verifyLoginWithoutPassword() {
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);

    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.login(myUsername, "");
    loginPage.verifyUnsucessfullLogin(errorMessageMissingPassword);
}
@Test
public void verifySucessfullLogout() {
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);

    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.login(myUsername, password);
    homePage.clickOnLogoutButton();
    loginPage.verifySucessfullLogout();
}

}
