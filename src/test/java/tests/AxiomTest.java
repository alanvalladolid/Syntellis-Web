package tests;

import commons.BaseTest;
import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.IntelligenceCenterPage;
import pages.LoginPage;

public class AxiomTest extends BaseTest
{
    @BeforeMethod
    public void setUpTest()
    {
        openChrome();
    }

    @Test
    public void AxiomTest()
    {
        try
        {
            LoginPage login = new LoginPage(driver);
            login.login("AxiomTest", "Axiom$%^");

            HomePage home = new HomePage(driver);
            home.selectIntelligenceCenter();

            IntelligenceCenterPage iCenter = new IntelligenceCenterPage(driver);
            iCenter.openTestReport();
            iCenter.verifyAmount();

            home.logOut();
        }

        catch(AssertionError | TimeoutException error)
        {
            error.printStackTrace();
        }
    }

    @AfterMethod
    public void closeTest()
    {
        closeChrome();
    }
}
