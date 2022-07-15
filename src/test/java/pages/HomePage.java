package pages;

import commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public static By waffleIcon = By.xpath("//*[@id='topnav']/div/div[3]/div/span[4]/div[1]/div[1]");
    public static By optionMenu = By.cssSelector("div[title='Intelligence Center']");
    public static By profileIcon = By.className("profile-button");
    public static By signOutBtn = By.className("sign-out-container");

    public void selectIntelligenceCenter()
    {
        click(waffleIcon);
        click(optionMenu);
    }

    public void logOut()
    {
        click(profileIcon);
        click(signOutBtn);
    }

}
