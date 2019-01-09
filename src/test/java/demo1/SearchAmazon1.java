package demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchAmazon1 {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");

        WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("teapod",Keys.ENTER);
        String actual=driver.getTitle();
        String expexted="Amazon.com: teapod";

        Assert.assertEquals(actual,expexted);
    }
}

