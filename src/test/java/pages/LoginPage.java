package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;
import static pages.OpenCalculatorPage.openCalculatorButton_xpath;

public class LoginPage extends BrowserDriver {

    public static String username_xpath = "//*[@placeholder = \"Username\"]";

    public static String password_xpath = "//*[@placeholder = \"Password\"]";

    public static String loginButton_xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[4]/div";


    public static void open_link() throws  InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://catchylabs-webclient.testinium.com/");
    }

    public static void enter_username() throws InterruptedException{

        Thread.sleep(2000);
        driver.findElement(By.xpath(username_xpath)).click();
        driver.findElement(By.xpath(username_xpath)).sendKeys("hakan.baser");
        Thread.sleep(2000);
        String assertUsername = driver.findElement(By.xpath(username_xpath)).getAttribute("value");
        assertEquals("hakan.baser", assertUsername);

    }

    public static void enter_password() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_xpath)).sendKeys("ZESik888");
    }

    public static void click_login() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(loginButton_xpath)).click();
    }

    public static void check_openCalculatorButton() throws InterruptedException{
        Thread.sleep(2000);
        String checkOpenCalButton = driver.findElement(By.xpath(openCalculatorButton_xpath)).getText();
        assertEquals("OPEN CALCULATOR",checkOpenCalButton);
    }

}
