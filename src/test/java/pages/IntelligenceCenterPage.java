package pages;

import commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class IntelligenceCenterPage extends BasePage
{
    public IntelligenceCenterPage(WebDriver driver)
    {
        super(driver);
    }

    public static By folderOption = By.xpath("//span[contains(text(), 'Test')]");
    public static By fileOption = By.xpath("//div[contains(text(), 'Test Report')]");
    public static By amount = By.xpath("//span[contains(text(), '251')]");

    public void openTestReport()
    {
        click(folderOption);
        click(fileOption);
    }

    public void verifyAmount()
    {
        String actualResult = getText(amount);
        Assert.assertTrue(actualResult.contains("251"));
    }

}
