package infrastructure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.BrowserDriver;

public class SeleniumDriver implements BrowserDriver {

    protected WebDriver driver;

    public SeleniumDriver() {
        this.driver = new ChromeDriver();
    }

    @Override
    public void navigateTo(String url) {
        driver.get(url);
    }

    @Override
    public void click(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }
    
}
