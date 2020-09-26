package edu.eci.tacs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElEmpleoMain {

    /**
     * Main del programa
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.elempleo.com/");
        WebElement boton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/div"));
        boton.click();
        empresas(driver);
        iniciarsesion(driver);



    }

    /**
     * Mostrar las empresas de tecnologia
     * @param driver
     * @throws InterruptedException
     */
    public static void empresas(WebDriver driver) throws InterruptedException{
        driver.get(driver.getCurrentUrl());
        driver.findElement(By.xpath("//*[@id=\"mainnav-toggle-menu\"]/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"IndustryFilter1\"]/option[30]")).click();
    }

    /**
     * registrarce en la plataforma
     * @param driver
     * @throws InterruptedException
     */
    public static void iniciarsesion(WebDriver driver) throws InterruptedException{
        driver.get(driver.getCurrentUrl());
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"btnlogin\"]"));
        boton.click();
        driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/a")).click();
    }

}
