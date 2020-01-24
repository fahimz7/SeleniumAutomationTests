package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateAmazon {
    static String url="https://www.amazon.com/";
    static WebDriver driver;

    static String iphone="div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > span > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-8-of-16.sg-col-16-of-24.sg-col-12-of-20.sg-col-24-of-32.sg-col.sg-col-28-of-36.sg-col-20-of-28 > div > div:nth-child(1) > div > div > div:nth-child(1) > h2 > a > span";
    public static void main(String[] args) throws InterruptedException {
        navigateTo(url);

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("milano cookies");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.findElement(By.cssSelector(iphone)).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(4000);
        driver.navigate().to(url);


        driver.close();
    }
    public static void navigateTo(String url){
        System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver");
        driver= new ChromeDriver();
        driver.navigate().to(url);
    }
}
