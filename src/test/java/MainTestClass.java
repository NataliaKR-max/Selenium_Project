import POM.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.xml.sax.SAXException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainTestClass {

    // Initializing the Extent Reports system values (Setting the headline/name of the report)
    private static ExtentReports extent = new ExtentReports();
    private static ExtentTest test = extent.createTest(Constants.TEST_NAME, Constants.TEST_DESCRIPTION);

    // Initializing the Extent Reports system paths (location of the report file & screenshots on the computer)
    private static String reportPath = Constants.REPORT_PATH;   // Report file location
    private static String folderPath = Constants.FOLDER_PATH;   // Screenshots location

    public static WebDriver driver;

    @BeforeTest
    public static void beforeClass() throws IOException, SAXException, ParserConfigurationException {

        // Initializing the Extent Reports system parameters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportPath);
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo(Constants.EXTENT_SYSTEM_INFO_KEY, Constants.EXTENT_SYSTEM_INFO_VALUE);

        // log information into the report
        test.log(Status.INFO, Constants.CONNECTING_DRIVER);

        // Getting the desirable browser from the XML file
        final String browser = BrowserAndURL.getData(Constants.BROWSER);

        // Get the driver object according to the chosen browser
        driver = BrowserAndURL.chooseBrowser(browser, driver);
        driver.manage().window().maximize();
    }

    @Test
    public void test01_LoadWebsite() throws IOException, SAXException, ParserConfigurationException {

        // log information into the report
        test.log(Status.INFO, "test01_LoadWebsite");

        // Load website
        try {
            driver.get(BrowserAndURL.getData(Constants.URL));
            test.log(Status.PASS, Constants.LOAD_WEBSITE_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

//            testSuccessScreenshot();
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.LOAD_WEBSITE_FAIL);
//            testFailScreenshot();
        }
    }

    @Test
    public void test02_RegisterScreen() {

        // log information into the report
        test.log(Status.INFO, "test02_RegisterScreen");

        // Pressing the register/Sign-in button
        try {
            RegisterScreen.registrationSigninButton(driver).click();
            test.log(Status.PASS, Constants.REGISTER_SIGNIN_SCREEN_BUTTON_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.REGISTER_SIGNIN_SCREEN_BUTTON_CLICKED_FAIL);
        }


        // Pressing the register button
        try {
            RegisterScreen.registrationButton(driver).click();
            test.log(Status.PASS, Constants.REGISTER_SCREEN_BUTTON_CLICKED_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.REGISTER_SCREEN_BUTTON_CLICKED_FAIL);
        }

        // Entering first name
        try {
            RegisterScreen.firstName(driver).sendKeys(Constants.REGISTER_USER_NAME);
            test.log(Status.PASS, Constants.ENTER_USER_NAME_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.ENTER_USER_NAME_FAIL);
        }

        // Entering email address
        try {
            RegisterScreen.eMail(driver).sendKeys(Constants.REGISTER_EMAIL);
            test.log(Status.PASS, Constants.ENTER_EMAIL_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.ENTER_EMAIL_FAIL);
        }

        // Entering password
        try {
            RegisterScreen.password(driver).sendKeys(Constants.REGISTER_PASSWORD);
            test.log(Status.PASS, Constants.ENTER_PASSWORD_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.ENTER_PASSWORD_FAIL);
        }

        // Entering password again
        try {
            RegisterScreen.passwordAgain(driver).sendKeys(Constants.REGISTER_PASSWORD);
            test.log(Status.PASS, Constants.ENTER_PASSWORD_AGAIN_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.ENTER_PASSWORD_AGAIN_FAIL);
        }

        // Pressing "I agree..."
        try {
            RegisterScreen.agreeToTerms(driver);
            test.log(Status.PASS, Constants.AGREE_TO_TERMS_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.AGREE_TO_TERMS_FAIL);
        }

        // Pressing the register button
        try {
            Thread.sleep(1000);
            RegisterScreen.registerUserButton(driver).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test03_HomeScreen() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // log information into the report
        test.log(Status.INFO, "test03_HomeScreen");

        // Pressing the price dropdown menu
        try {
            HomeScreen.priceRangeDropdownMenu(driver).click();
            test.log(Status.PASS, Constants.PRICE_RANGE_DROPDOWN_ELEMENT_CLICKED_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.PRICE_RANGE_DROPDOWN_ELEMENT_CLICKED_FAIL);
        }

        // choosing price range - 100-199
        try {
            HomeScreen.priceRangePicker(driver).click();
            test.log(Status.PASS, Constants.PRICE_RANGE_CHOICE_CLICKED_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.PRICE_RANGE_CHOICE_CLICKED_FAIL);
        }

        // Pressing the area dropdown menu
        try {
            HomeScreen.areaDropDownMenu(driver).click();
            test.log(Status.PASS, Constants.AREA_DROPDOWN_ELEMENT_CLICKED_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.AREA_DROPDOWN_ELEMENT_CLICKED_FAIL);
        }

        // choosing area
        try {
            HomeScreen.areaPicker(driver).click();
            test.log(Status.PASS, Constants.AREA_CHOICE_CLICKED_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.AREA_CHOICE_CLICKED_FAIL);
        }

        // Pressing the category dropdown menu
        try {
            HomeScreen.categoryDropDownMenu(driver).click();
            test.log(Status.PASS, Constants.CATEGORY_DROPDOWN_ELEMENT_CLICKED_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.CATEGORY_DROPDOWN_ELEMENT_CLICKED_FAIL);
        }

        // choosing category
        try {
            HomeScreen.categoryPicker(driver).click();
            test.log(Status.PASS, Constants.CATEGORY_CHOICE_CLICKED_SUCCESS);
        } catch (Exception e) {
            test.log(Status.FAIL, Constants.CATEGORY_CHOICE_CLICKED_FAIL);
        }

        // Pressing the search button
        try {
            HomeScreen.searchButton(driver).click();
            test.log(Status.PASS, Constants.SEARCH_BUTTON_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.SEARCH_BUTTON_CLICKED_FAIL);
        }
    }

    @Test
    public void test04_Pick_business() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // log information into the report
        test.log(Status.INFO, "test04_GiftScreen");

        // Assert webpage URL
        Assert.assertNotEquals(Constants.WEBSITE_ADDRESS, Constants.WEBPAGE_URL_CHANGE);

        // Pressing Opticana
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // Need to wait for the element to appear
        try {
            PickBusiness.buisnessPicker(driver).click();
            Thread.sleep(1500);  // Waiting for loading time
            test.log(Status.PASS, Constants.OPTICANA_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.OPTICANA_CLICKED_FAIL);
        }

        // price input
        try {
            SenderAndReceiverInformationScreen.priceInput(driver).sendKeys(Constants.AMOUNT);
            test.log(Status.PASS, Constants.AMOUNT_INPUT_FIELD_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.AMOUNT_INPUT_FIELD_CLICKED_FAIL);
        }

    }

    @Test
    public void test05_Sender_Receiver() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // log information into the report
        test.log(Status.INFO, "test05_Sender_Receiver");

        // price input
        try {
            SenderAndReceiverInformationScreen.priceInput(driver).sendKeys(Constants.AMOUNT);
            test.log(Status.PASS, Constants.AMOUNT_INPUT_FIELD_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.AMOUNT_INPUT_FIELD_CLICKED_FAIL);
        }

        // submit price
        try {
            SenderAndReceiverInformationScreen.submitAmountButton(driver).click();
            test.log(Status.PASS, Constants.CHOOSE_BUTTON_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.CHOOSE_BUTTON_CLICKED_FAIL);
        }

        // Someone else radio button
        try {
            SenderAndReceiverInformationScreen.someoneElseRadioButton(driver).click();
            test.log(Status.PASS, Constants.SOMEONE_ELSE_RADIO_BUTTON_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.SOMEONE_ELSE_RADIO_BUTTON_CLICKED_FAIL);
        }

        // Enter receiver name
        try {
            SenderAndReceiverInformationScreen.receiverName(driver).sendKeys(Constants.RECEIVER_NAME);
            test.log(Status.PASS, Constants.RECEIVER_NAME_ENTERED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.RECEIVER_NAME_ENTERED_FAIL);
        }

        // Sender name
        try {
            SenderAndReceiverInformationScreen.senderName(driver).clear();
            SenderAndReceiverInformationScreen.senderName(driver).sendKeys(Constants.SENDER_NAME);
            test.log(Status.PASS, Constants.SENDER_NAME_ENTERED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.SENDER_NAME_ENTERED_FAIL);
        }

        // Enter a greeting
        try {
            SenderAndReceiverInformationScreen.greeting(driver).sendKeys(Constants.BLESSING);
            test.log(Status.PASS, Constants.BLESSING_ENTERED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.BLESSING_ENTERED_FAIL);
        }

        // Upload Pic
        try {
            SenderAndReceiverInformationScreen.uploadPic(driver).sendKeys(Constants.PICUTE_PATH);
            test.log(Status.PASS, Constants.PICTURE_UPLOADED_SUCCESS);

            // wait for the image to be displayed
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.PICTURE_UPLOADED_FAIL);
        }

        // After payment radio button click
        try {
            SenderAndReceiverInformationScreen.sendAfterPaymentRadioButton(driver).click();
            test.log(Status.PASS, Constants.AFTER_PAYMENT_RADIO_BUTTON_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.AFTER_PAYMENT_RADIO_BUTTON_CLICKED_FAIL);
        }

        // Pick SMS option
        try {
            SenderAndReceiverInformationScreen.smsOption(driver).click();
            test.log(Status.PASS, Constants.SMS_IMAGE_ELEMENT_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.SMS_IMAGE_ELEMENT_CLICKED_FAIL);
        }

        // Enter SMS sender number
        try {
            SenderAndReceiverInformationScreen.senderPhoneNumber(driver).sendKeys(Constants.SENDER_PHONE_NUMBER);
            test.log(Status.PASS, Constants.SENDER_PHONE_NUMBER_ENTERED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.SENDER_PHONE_NUMBER_ENTERED_FAIL);
        }

        // Enter SMS receiver number
        try {
            SenderAndReceiverInformationScreen.receiverPhoneNumber(driver).sendKeys(Constants.RECEIVER_PHONE_NUMBER);
            test.log(Status.PASS, Constants.RECEIVER_PHONE_NUMBER_ENTERED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.RECEIVER_PHONE_NUMBER_ENTERED_FAIL);
        }

        // Click the save numbers button
        try {
            SenderAndReceiverInformationScreen.saveNumbersButton(driver).sendKeys(Constants.SAVE_BUTTON);
            test.log(Status.PASS, Constants.SAVE_BUTTON_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.SAVE_BUTTON_CLICKED_FAIL);
        }

        // Submit button
        try {
            SenderAndReceiverInformationScreen.payButton(driver).sendKeys(Constants.SUBMIT_BUTTON);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            test.log(Status.PASS, Constants.SUBMIT_BUTTON_CLICKED_SUCCESS);
            test.pass("Screenshot ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(folderPath + new Random())).build());

        } catch (Exception e) {
            test.log(Status.FAIL, Constants.SUBMIT_BUTTON_CLICKED_FAIL);
        }
    }

    @AfterClass
    public static void afterClass() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
        // end test and save data into report file
        extent.flush();
    }

    // take screnshot and return picture path
    private static String takeScreenShot(String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath + ".png";
    }
}
