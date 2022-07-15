package pages;

import commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage
{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public static By usuarioInput = By.id("username");
    public static By passwordInput = By.id("password");

    public static By loginBtn = By.id("loginbtn");

    public void login(String usuario, String password)
    {
        type(usuario, usuarioInput);
        type(password, passwordInput);
        click(loginBtn);
    }
}
