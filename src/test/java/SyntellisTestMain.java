import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SyntellisTestMain
{
    public static void main(String[] args)
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://axiomepm-qa-bat.axiomdevtest.cloud/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement usuarioInput = driver.findElement(By.id("username"));
        usuarioInput.sendKeys("AxiomTest");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Axiom$%^");

        WebElement loginBtn = driver.findElement(By.id("loginbtn"));
        loginBtn.click();

        WebElement waffleIcon = driver.findElement(By.xpath("//*[@id='topnav']/div/div[3]/div/span[4]/div[1]/div[1]"));
        waffleIcon.click();

        WebElement optionMenu = driver.findElement(By.cssSelector("div[title='Intelligence Center']"));
        optionMenu.click();

        WebElement folderOption = driver.findElement(By.xpath("//span[contains(text(), 'Test')]"));
        folderOption.click();

        WebElement fileOption = driver.findElement(By.xpath("//div[contains(text(), 'Test Report')]"));
        fileOption.click();

        WebElement amount = driver.findElement(By.xpath("//span[contains(text(), '251')]"));
        String actualResult = amount.getText();
        Assert.assertTrue(actualResult.contains("251"));

        WebElement profileIcon = driver.findElement(By.className("profile-button"));
        profileIcon.click();

        WebElement signOutBtn = driver.findElement(By.className("sign-out-container"));
        signOutBtn.click();

        driver.close();
        driver.quit();
    }
}
