package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePage {
    static String url = "https://www.google.com/";
    static String amazonUrl = "https://www.amazon.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //negivateTo(url);
        negivateTo(amazonUrl);

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.navigate().back();

        driver.quit();

    }

    public static void negivateTo(String url){
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver");
        // create a object for chromeDriver
         driver = new ChromeDriver();
        // Navigate to Url
        //driver.get(url);
        driver.navigate().to(url);
        //driver.navigate().back();
        //close the Browser
        //driver.close();
    }
    }

