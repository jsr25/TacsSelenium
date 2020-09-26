package edu.eci.tacs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * The type Automation practice dot com.
 */
public class AutomationPracticeDotCom {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws InterruptedException the interrupted exception
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        String[] paths = new String[]{"//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span","//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span","//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]/span"};
        addCart(driver,paths);
        checkCart(driver,paths.length);
    }

    /**
     * Add to cart test, Search for a lists of elements and add them to the shop cart
     * @param drive The Selenium WebDriver (Chrome, firefox,etc)
     * @param paths All the Product paths
     * @throws InterruptedException
     */
    private static void addCart(WebDriver drive,String[] paths) throws InterruptedException {
        for(String s: paths){
            WebElement button = drive.findElement(By.xpath(s));
            button.click();
            Thread.sleep(2000);
            WebElement continueS = drive.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span"));
            continueS.click();
        }
    }

    /**
     * Checks if the cart was filled with the products
     * @param drive The Selenium WebDriver (Chrome, firefox,etc)
     * @param spected The spected number of items
     */
    private static void checkCart(WebDriver drive,int spected){
        WebElement cartButton = drive.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        cartButton.click();
        WebElement items = drive.findElement(By.xpath("//*[@id=\"summary_products_quantity\"]"));
        Assert.assertEquals(spected+" Products",items.getText());
        System.out.println("Successfull");
    }
}
