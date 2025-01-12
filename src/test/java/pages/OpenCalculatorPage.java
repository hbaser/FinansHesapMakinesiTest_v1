package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class OpenCalculatorPage extends BrowserDriver {

    public static String openCalculatorButton_xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div/div[2]";

    public static void click_openCalculatorButton() throws InterruptedException{

        Thread.sleep(2000);
        driver.findElement(By.xpath(openCalculatorButton_xpath)).click();
    }

}
