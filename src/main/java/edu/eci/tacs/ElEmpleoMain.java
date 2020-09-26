package edu.eci.tacs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElEmpleoMain {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.elempleo.com/");
        WebElement boton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/div"));
        boton.click();
        empresas(driver);
        iniciarsesion(driver);



    }

    public static void empresas(WebDriver driver) throws InterruptedException{
        driver.get("https://www.elempleo.com/co/ofertas-empleo/");
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"mainnav-toggle-menu\"]/ul/li[5]/a"));
        boton.click();
    }

    public static void iniciarsesion(WebDriver driver){
        driver.get("https://www.elempleo.com/co/empleos-empresas/");
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"btnlogin\"]"));
        boton.click();

    }

}
