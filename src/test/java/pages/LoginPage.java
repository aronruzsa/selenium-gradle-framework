package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class LoginPage extends BasePage {

    private By usernameInput = By.cssSelector("[data-test='username']");
    private By passwordInput = By.cssSelector("[data-test='password']");
    private By loginButton = By.cssSelector("[data-test='login-button']");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeUsernameAndPassword(String username, String password) {
        log.info("Type {} in username and {} in password input fields.", username, password);
        getWebElementByLocator(usernameInput).sendKeys(username);
        getWebElementByLocator(passwordInput).sendKeys(password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on login button.");
        getWebElementByLocator(loginButton).click();
    }
}
