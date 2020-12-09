package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SenderAndReceiverInformationScreen {

    private static WebElement element = null;

    // Enter amount
    public static WebElement priceInput(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.AMOUNT_INPUT_FIELD));
        return element;
    }

    // Submit button
    public static WebElement submitAmountButton(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.CHOOSE_BUTTON));
        return element;
    }

    // Press "someone else" radio button
    public static WebElement someoneElseRadioButton(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.SOMEONE_ELSE_RADIO_BUTTON));
        return element;
    }
    // Enter receiver's name
    public static WebElement receiverName(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.RECEIVER_NAME_INPUT_FIELD));
        return element;
    }

    // Enter sender name
    public static WebElement senderName(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.SENDER_NAME_INPUT_FIELD));
        return element;
    }

    // Event dropdown menu
    public static WebElement eventDropDownMenu(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.EVENT_DROPDOWN_MENU));
        return element;
    }

    // Choose event (birthday)
    public static WebElement chooseEvent(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.EVENT_BIRTHDAY));
        return element;
    }

    // Enter a blessing
    public static WebElement greeting(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.BLESSING_INPUT_FIELD));
        return element;
    }

    // Upload a picture
    public static WebElement uploadPic(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.UPLOAD_PICTURE_BUTTON));
        return element;
    }

    // Press "after payment" radio button
    public static WebElement sendAfterPaymentRadioButton(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.AFTER_PAYMENT_RADIO_BUTTON));
        return element;
    }

    // Press the SMS image
    public static WebElement smsOption(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.SMS_IMAGE_ELEMENT));
        return element;
    }
    // Enter sender's phone number
    public static WebElement senderPhoneNumber(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.SENDER_PHONE_NUMBER_INPUT_FIELD));
        return element;
    }

    // Enter receiver's phone number
    public static WebElement receiverPhoneNumber(WebDriver driver) {
        element = driver.findElement(By.id(Constants.RECEIVER_PHONE_NUMBER_INPUT_FIELD));
        return element;
    }

    // Click the save button
    public static WebElement saveNumbersButton(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.SAVE_BUTTON));
        return element;
    }

    // Click the submit button
    public static WebElement payButton(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.SUBMIT_BUTTON));
        return element;
    }
}
