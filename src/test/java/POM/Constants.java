package POM;

public class Constants {


    final public static String TEST_NAME = "BuyMe WebSite Test";
    final public static String TEST_DESCRIPTION = "Sanity Tests";
    final public static String REPORT_PATH = "C:\\Users\\NoOne\\Selenium_Project.html";
    final public static String FOLDER_PATH = "C:\\Users\\NoOne\\Selenium_Project\\ScreenShots\\";

    final public static String EXTENT_SYSTEM_INFO_KEY = "Environment";
    final public static String EXTENT_SYSTEM_INFO_VALUE = "Production";
    final public static String CONNECTING_DRIVER = "Connecting driver";


    // Google Chrome
    final public static String CHROME = "chrome";
    final public static String CHROME_DRIVER_SERVER_NAME = "webdriver.chrome.driver";
    // final public static String CHROME_DRIVER_FILE_PATH = "C:\\Users\\motin\\Downloads\\chromedriver_win32\\chromedriver.exe";
    final public static String CHROME_DRIVER_FILE_PATH = "C:\\Users\\NoOne\\Documents\\chromedriver_win32\\chromedriver.exe";

    // Mozilla FireFox
    final public static String FIREFOX = "firefox";
    final public static String FIREFOX_DRIVER_SERVER_NAME = "webdriver.gecko.driver";
    final public static String FIREFOX_DRIVER_FILE_PATH = "C:\\Users\\NoOne\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe";

    // Microsoft Edge
    final public static String EDGE = "edge";
    final public static String EDGE_DRIVER_SERVER_NAME = "webdriver.edge.driver";
    final public static String EDGE_DRIVER_FILE_PATH = "c:\\automation\\drivers\\MicrosoftWebDriver.exe";

    // Microsoft Internet Explorer
    final public static String IE = "explorer";
    final public static String IE_DRIVER_SERVER_NAME = "webdriver.ie.driver";
    final public static String IE_DRIVER_FILE_PATH = "c:\\automation\\drivers\\IEDriverServer.exe";

    public static final String LOAD_WEBSITE_SUCCESS = "Load website - Success";
    public static final String LOAD_WEBSITE_FAIL = "Load website - Fail";


    public static final String BROWSER_AND_URL_FILE = "C:\\Users\\NoOne\\Desktop\\SeleniumProjectfile.txt";
    public static final String URL = "URL";
    public static final String BROWSER = "Browser";
    public static final String WEBSITE_ADDRESS = "www.buyme.co.il";



    public static final String REGISTER_SIGNIN_SCREEN_BUTTON = "//span[contains(text(),'הרשמה')]";
    public static final String REGISTER_SIGNIN_SCREEN_BUTTON_CLICKED_SUCCESS = "Register sign-in screen button clicked - Success";
    public static final String REGISTER_SIGNIN_SCREEN_BUTTON_CLICKED_FAIL = "Register sign-in screen button clicked - Fail";

    public static final String REGISTER_SCREEN_BUTTON = "//span[@class='text-btn']";
    public static final String REGISTER_SCREEN_BUTTON_CLICKED_SUCCESS = "Register screen button clicked - Success";
    public static final String REGISTER_SCREEN_BUTTON_CLICKED_FAIL = "Register screen button clicked - Fail";

    public static final String REGISTER_USER_NAME = "Natalia";
    public static final String FIRST_NAME_FIELD = "//input[@placeholder='שם פרטי']";
    public static final String ENTER_USER_NAME_SUCCESS = "Enter user name - Success";
    public static final String ENTER_USER_NAME_FAIL = "Enter user name - Fail";

    public static final String REGISTER_EMAIL = "natalia.bsy@gmail.com";
    public static final String EMAIL_FIELD = "//input[@placeholder='מייל']";
    public static final String ENTER_EMAIL_SUCCESS = "Enter email - Success";
    public static final String ENTER_EMAIL_FAIL = "Enter email - Fail";

    public static final String REGISTER_PASSWORD = "N77889";
    public static final String PASSWORD_FIELD = "//input[@placeholder='סיסמה']";
    public static final String ENTER_PASSWORD_SUCCESS = "Enter password - Success";
    public static final String ENTER_PASSWORD_FAIL = "Enter password - Fail";

    public static final String PASSWORD_AGAIN_FIELD = "//input[@placeholder='אימות סיסמה']";
    public static final String ENTER_PASSWORD_AGAIN_SUCCESS = "Enter password again - Success";
    public static final String ENTER_PASSWORD_AGAIN_FAIL = "Enter password again - Fail";

    public static final String AGREE_TO_TERMS = "fa";
    public static final String AGREE_TO_TERMS_SUCCESS = "Agree to terms - Success";
    public static final String AGREE_TO_TERMS_FAIL = "Agree to terms - Fail";

    public static final String REGISTER_USER_BUTTON = "button.ui-btn[type='submit']";
    public static final String REGISTER_USER_BUTTON_CLICKED_SUCCESS = "Register user button clicked - Success";
    public static final String REGISTER_USER_BUTTON_CLICKED_FAIL = "Register user button clicked - Fail";


    public static final String PRICE_RANGE_DROPDOWN_ELEMENT = "//span[contains(text(),'סכום')]";
    public static final String PRICE_RANGE_DROPDOWN_ELEMENT_CLICKED_SUCCESS = "Price range dropdown menu clicked - Success";
    public static final String PRICE_RANGE_DROPDOWN_ELEMENT_CLICKED_FAIL = "Price range dropdown menu clicked - Fail";

    public static final String PRICE_RANGE_CHOICE = "//li[contains(text(),'100-199')]";
    public static final String PRICE_RANGE_CHOICE_CLICKED_SUCCESS = "Price range choice clicked - Success";
    public static final String PRICE_RANGE_CHOICE_CLICKED_FAIL = "Price range choice clicked - Fail";

    // Pressing the area dropdown menu
    public static final String AREA_DROPDOWN_ELEMENT = "//span[contains(text(),'אזור')]";
    public static final String AREA_DROPDOWN_ELEMENT_CLICKED_SUCCESS = "Area dropdown menu clicked - Success";
    public static final String AREA_DROPDOWN_ELEMENT_CLICKED_FAIL = "Area dropdown menu clicked - Fail";

    // choosing area
    public static final String AREA_CHOICE = "//li[contains(text(),'צפון')]";
    public static final String AREA_CHOICE_CLICKED_SUCCESS = "Area choice clicked - Success";
    public static final String AREA_CHOICE_CLICKED_FAIL = "Area choice clicked - Fail";

    // Pressing the category dropdown menu
    public static final String CATEGORY_DROPDOWN_ELEMENT = "//span[contains(text(),'קטגוריה')]";
    public static final String CATEGORY_DROPDOWN_ELEMENT_CLICKED_SUCCESS = "Category dropdown menu clicked - Success";
    public static final String CATEGORY_DROPDOWN_ELEMENT_CLICKED_FAIL = "Category dropdown menu clicked - Fail";

    // choosing category
    public static final String CATEGORY_CHOICE = "//li[contains(text(),'גיפט קארד למותגי אופנה')]";
    public static final String CATEGORY_CHOICE_CLICKED_SUCCESS = "Category choice clicked - Success";
    public static final String CATEGORY_CHOICE_CLICKED_FAIL = "Category choice clicked - Fail";

    // Pressing the search button
    public static final String SEARCH_BUTTON = ".search.ui-btn";
    public static final String SEARCH_BUTTON_CLICKED_SUCCESS = "Search button clicked - Success";
    public static final String SEARCH_BUTTON_CLICKED_FAIL = "Search button clicked - Fail";


    public static final String WEBPAGE_URL_CHANGE = "https://buyme.co.il/search?budget=2&category=22&region=9";

    public static final String BUISNESS = "[href='https://buyme.co.il/supplier/352936']";
    public static final String OPTICANA_CLICKED_SUCCESS = "Opticana clicked - Success";
    public static final String OPTICANA_CLICKED_FAIL = "Opticana clicked - Fail";


    // Enter amount
    public static final String AMOUNT = "100";
    public static final String AMOUNT_INPUT_FIELD = "//input[@placeholder='מה הסכום?']";
    public static final String AMOUNT_INPUT_FIELD_CLICKED_SUCCESS = "Amount Input field clicked - Success";
    public static final String AMOUNT_INPUT_FIELD_CLICKED_FAIL = "Amount Input field clicked - Fail";

    // Click submit for the amount
    public static final String CHOOSE_BUTTON = "//button[contains(text(),'לבחירה')]";
    public static final String CHOOSE_BUTTON_CLICKED_SUCCESS = "Choose button clicked - Success";
    public static final String CHOOSE_BUTTON_CLICKED_FAIL = "Choose button clicked - Fail";

    // Press "someone else" radio button
    public static final String SOMEONE_ELSE_RADIO_BUTTON = "//span[contains(text(),'למישהו אחר')]";
    public static final String SOMEONE_ELSE_RADIO_BUTTON_CLICKED_SUCCESS = "Someone else radio button clicked - Success";
    public static final String SOMEONE_ELSE_RADIO_BUTTON_CLICKED_FAIL = "Someone else radio button clicked - Fail";

    // Enter receiver's name
    public static final String RECEIVER_NAME = "Automation cource";
    public static final String RECEIVER_NAME_INPUT_FIELD = "//input[@data-parsley-required-message='מי הזוכה המאושר? יש להשלים את שם המקבל/ת']";
    public static final String RECEIVER_NAME_ENTERED_SUCCESS = "Receiver name entered - Success";
    public static final String RECEIVER_NAME_ENTERED_FAIL = "Receiver name entered - Fail";

    // Enter sender name
    public static final String SENDER_NAME = "Natalia";
    public static final String SENDER_NAME_INPUT_FIELD = "//input[@data-parsley-required-message='למי יגידו תודה? שכחת למלא את השם שלך']";
    public static final String SENDER_NAME_ENTERED_SUCCESS = "Sender name entered - Success";
    public static final String SENDER_NAME_ENTERED_FAIL = "Sender name entered - Fail";

    // Event dropdown menu
    public static final String EVENT_DROPDOWN_MENU = "//span[contains(text(),'לאיזה אירוע?')]";
    public static final String EVENT_DROPDOWN_MENU_SUCCESS = "Birthday event chosen - Success";
    public static final String EVENT_DROPDOWN_MENU_FAIL = "Birthday event chosen - Fail";

    // Choose event (birthday)
    public static final String EVENT_BIRTHDAY = "//option[contains(text(),'יום הולדת')]";
    public static final String EVENT_BIRTHDAY_CHOSEN_SUCCESS = "Birthday event chosen - Success";
    public static final String EVENT_BIRTHDAY_CHOSEN_FAIL = "Birthday event chosen - Fail";

    // Enter a blessing
    public static final String BLESSING_INPUT_FIELD = "//textarea[@placeholder='מזל טוב, תודה רבה או פשוט מלא אהבה? כאן כותבים מילים טובות ואיחולים שמחים, עד 100 תווים']";
    public static final String BLESSING = "Wishing you a Happy New Year!";
    public static final String BLESSING_ENTERED_SUCCESS = "Sender name entered - Success";
    public static final String BLESSING_ENTERED_FAIL = "Sender name entered - Fail";

    // Upload a picture
    public static final String UPLOAD_PICTURE_BUTTON = "//input[@name='fileUpload']";
    public static final String PICUTE_PATH = "C:No picture";
    public static final String PICTURE_UPLOADED_SUCCESS = "Picture uploaded - Success";
    public static final String PICTURE_UPLOADED_FAIL = "Picture uploaded - Fail";

    // Press "after payment" radio button
    public static final String AFTER_PAYMENT_RADIO_BUTTON = "//label[contains(text(),'מיד אחרי התשלום')]";
    public static final String AFTER_PAYMENT_RADIO_BUTTON_CLICKED_SUCCESS = "After payment radio button clicked - Success";
    public static final String AFTER_PAYMENT_RADIO_BUTTON_CLICKED_FAIL = "After payment radio button clicked - Fail";

    // Press the SMS image
    public static final String SMS_IMAGE_ELEMENT = "//span[contains(text(),'ב-SMS')]";
    public static final String SMS_IMAGE_ELEMENT_CLICKED_SUCCESS = "SMS image clicked - Success";
    public static final String SMS_IMAGE_ELEMENT_CLICKED_FAIL = "SMS image clicked - Fail";

    // Enter sender's phone number
    public static final String SENDER_PHONE_NUMBER_INPUT_FIELD = "//input[@placeholder='ספרות בלבד, בלי מקף']";
    public static final String SENDER_PHONE_NUMBER = "0507237818";
    public static final String SENDER_PHONE_NUMBER_ENTERED_SUCCESS = "Sender hone number entered - Success";
    public static final String SENDER_PHONE_NUMBER_ENTERED_FAIL = "Sender phone number entered - Fail";

    // Enter receiver's phone number
    public static final String RECEIVER_PHONE_NUMBER_INPUT_FIELD = "resendReciver";
    public static final String RECEIVER_PHONE_NUMBER = "0507237818";
    public static final String RECEIVER_PHONE_NUMBER_ENTERED_SUCCESS = "Receiver phone number entered - Success";
    public static final String RECEIVER_PHONE_NUMBER_ENTERED_FAIL = "Receiver phone number entered - Fail";

    // Click the save button
    public static final String SAVE_BUTTON = "//button[contains(text(),'שמירה')]";
    public static final String SAVE_BUTTON_CLICKED_SUCCESS = "Save button clicked - Success";
    public static final String SAVE_BUTTON_CLICKED_FAIL = "Save button clicked - Fail";

    // Click the submit button
    public static final String SUBMIT_BUTTON = "//div[@class='submit-wrapper']//button[text()='תשלום']";
    public static final String SUBMIT_BUTTON_CLICKED_SUCCESS = "Submit button clicked - Success";
    public static final String SUBMIT_BUTTON_CLICKED_FAIL = "Submit button clicked - Fail";


}
