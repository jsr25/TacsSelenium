package edu.eci.tacs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DineroMain {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dinero.com/");
        verDolar(driver);
        precioPretoleo(driver);
    }
    public static void verDolar(WebDriver driver){
        driver.findElement(By.xpath("/html/body/div[2]/div/section/header/div[5]/div/div/div/ul/li[3]/a")).click();
        driver.get("https://www.dinero.com/empresas/confidencias-on-line/articulo/dolar-hoy--precio-del-dolar-baja-en-colombia-hoy-28-de-agosto-de-2020/297218");
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/section/div[10]/div[2]/div/div[4]/div/div/header/h3"));
        String texto = element.getText();

        //System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/section/div[10]/div[1]/div[1]/header/div[3]/h2")));
        Assert.assertEquals(texto,"HABLAN LAS MARCAS");
        //assertEquals(texto,"HABLAN LAS MARCAS");
        // HABLAN LAS MARCAS assert true;
    }
    public static void precioPretoleo(WebDriver driver){
        driver.findElement(By.xpath("/html/body/div[2]/div/section/header/div[5]/div/div/div/ul/li[5]/a")).click();
        System.out.println("Successfull");
        driver.close();

    }
}