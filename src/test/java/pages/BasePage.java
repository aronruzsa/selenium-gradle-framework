package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofMillis(5000));
    }

    public WebElement getWebElementByLocator(By locator) {
        waitUntilElementIsVisible(locator);
        return driver.findElement(locator);
    }

    protected void waitUntilElementIsVisible(By locator) {
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
