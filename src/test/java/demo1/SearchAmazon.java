package demo1;
/*
Search Amazon
1.Open browser

Go to https://amazon.com
Enter any search term
Click on search button
5.Verify title contains the search term
 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.Assert;

public class SearchAmazon {

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver","/Users/mesutduman/Documents/selenium dependencies/Drivers/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.get("https://amazon.com");

        WebElement search= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        search.sendKeys("teapod"+ Keys.ENTER);

        String actual= driver.getTitle();
        String expexted="d";




    }
}
