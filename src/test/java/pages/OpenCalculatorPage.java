package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class OpenCalculatorPage extends BrowserDriver {

    public static String openCalculatorButton_xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div/div[2]";

    public static String asserCalculator_xpath  = "//*[@id="root"]/div/div[2]/div[2]/div[1]/div/div/div";

    public static void click_openCalculatorButton() throws InterruptedException{

        Thread.sleep(2000);
        driver.findElement(By.xpath(openCalculatorButton_xpath)).click();
    }

    public static void check_Calculator() throws InterruptedException{
        Thread.sleep(2000);
        String checkOpenCalButton = driver.findElement(By.xpath(openCalculatorButton_xpath)).getText();
        assertEquals("OPEN CALCULATOR",checkOpenCalButton);
    }

}
