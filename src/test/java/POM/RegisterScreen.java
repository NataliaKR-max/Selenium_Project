package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RegisterScreen {

    private static WebElement element = null;

    // Register/Sign-in button
    public static WebElement registrationSigninButton(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.REGISTER_SIGNIN_SCREEN_BUTTON));
        return element;
    }

    // Register option
    public static WebElement registrationButton(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.REGISTER_SCREEN_BUTTON));
        return element;
    }

    // Entering first name
    public static WebElement firstName(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.FIRST_NAME_FIELD));
        return element;
    }

    // Entering email address
    public static WebElement eMail(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.EMAIL_FIELD));
        return element;
    }
    // Entering password
    public static WebElement password(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.PASSWORD_FIELD));
        return element;
    }
    // Entering password again
    public static WebElement passwordAgain(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.PASSWORD_AGAIN_FIELD));
        return element;
    }
    // Pressing "I agree"
    public static void agreeToTerms(WebDriver driver) {
        element = driver.findElement(By.className(Constants.AGREE_TO_TERMS));
        new Actions(driver).moveToElement(element).click().perform();   // needed to come into focus
    }
    // Pressing the register button
    public static WebElement registerUserButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector(Constants.REGISTER_USER_BUTTON));
        return element;
    }
}
