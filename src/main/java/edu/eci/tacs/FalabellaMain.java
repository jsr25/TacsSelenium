package edu.eci.tacs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FalabellaMain {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.falabella.com.co/falabella-co/");
        menu(driver);
        System.out.println(driver.getCurrentUrl());

        //WebElement juego = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/section[2]/div/div[2]/div[1]/div/a"));
        //juego.click();
        //driver.close();
        //driver.get("https://www.falabella.com.co/falabella-co/");
    }

    private static void menu(WebDriver drive){
        WebElement close = drive.findElement(By.id("lightbox-close"));
        close.click();
        WebElement input  = drive.findElement(By.id("searchQuestionSolr"));
        input.sendKeys("Xbox");
        input.submit();

    }
}
