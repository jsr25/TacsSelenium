package edu.eci.tacs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeepLMain {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.deepl.com/translator");
        traductor(driver);
        driver.close();
    }

    public static void traductor(WebDriver driver) throws InterruptedException {
        WebElement input = driver.findElement(By.className("lmt__textarea_container"));
        input.click();
        input = driver.findElement(By.xpath("//*[@class=\"lmt__inner_textarea_container\"]/textarea"));
        input.sendKeys("This text is to test the deepl application Web whit selenium WebDriver");
        Thread.sleep(5000);
        input.clear();
        input = driver.findElement(By.xpath("//*[@class=\"lmt__inner_textarea_container\"]/textarea"));
        input.sendKeys("Ce texte est destiné à tester l'application deepl Web whit selenium WebDriver");
        Thread.sleep(5000);
        input.clear();
        input = driver.findElement(By.xpath("//*[@class=\"lmt__inner_textarea_container\"]/textarea"));
        input.sendKeys("Dieser Text soll die Tiefenanwendung Web mit Selenium WebDriver testen.");
        Thread.sleep(5000);
        input.clear();
    }
}
