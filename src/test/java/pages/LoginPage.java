package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginPage extends BasePage {

    private static final By USERNAME_INPUT = By.cssSelector("[data-test='username']");
    private static final By PASSWORD_INPUT = By.cssSelector("[data-test='password']");
    private static final By LOGIN_BUTTON = By.cssSelector("[data-test='login-button']");
    private static final By ERROR_MESSAGE = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeUsernameAndPassword(String username, String password) {
        log.info("Type {} in username and {} in password input fields.", username, password);
        getWebElementByLocator(USERNAME_INPUT).sendKeys(username);
        getWebElementByLocator(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on login button.");
        getWebElementByLocator(LOGIN_BUTTON).click();
    }

    public String getErrorMessageText() {
        log.info("Get error message text on Login page.");
        return getWebElementByLocator(ERROR_MESSAGE).getText();
    }
}
