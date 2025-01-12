package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class CalculatorPage extends BrowserDriver {

    public static String number1_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[13]";
    public static String number2_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[14]";
    public static String number3_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[15]";
    public static String number4_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[9]";
    public static String number5_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[10]";
    public static String number6_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[11]";
    public static String number7_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[5]";
    public static String number8_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[6]";
    public static String number9_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[7]";
    public static String number0_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[17]";
    public static String topla_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[16]";
    public static String cikar_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[12]";
    public static String carp_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[8]";
    public static String bol_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[4]";
    public static String esittir_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[20]";
    public static String check_result_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div";
    public static String ondalik_xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[19]";
    public static String cikis_xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[3]/div/div/div";

    public static void click_number1() throws InterruptedException{
    Thread.sleep(2000);
    driver.findElement(By.xpath(number1_xpath)).click();
    }

    public static void click_number2() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(number2_xpath)).click();
    }

    public static void click_number3() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(number3_xpath)).click();
    }

    public static void click_number4() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(number4_xpath)).click();
    }

    public static void click_number5() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(number5_xpath)).click();
    }

    public static void click_number6() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(number6_xpath)).click();
    }

    public static void click_number7() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(number7_xpath)).click();
    }

    public static void click_number8() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(number8_xpath)).click();
    }

    public static void click_number9() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(number9_xpath)).click();
    }

    public static void click_number0() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(number0_xpath)).click();
    }

    public static void click_topla() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(topla_xpath)).click();
    }

    public static void click_cikar() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(cikar_xpath)).click();
    }

    public static void click_carp() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(carp_xpath)).click();
    }

    public static void click_bol() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(bol_xpath)).click();
    }

    public static void click_esittir() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(esittir_xpath)).click();
    }

    public static void click_ondalik() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(ondalik_xpath)).click();
    }

    public static void click_cikis() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(cikis_xpath)).click();
    }

    public static void chResultCs1() throws InterruptedException{
        Thread.sleep(2000);
        String checkResultCs1 = driver.findElement(By.xpath(check_result_xpath)).getText();
        assertEquals("105",checkResultCs1);
    }

}