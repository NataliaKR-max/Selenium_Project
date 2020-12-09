package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeScreen {

    private static WebElement element = null;

    // Press the price dropdown menu
    public static WebElement priceRangeDropdownMenu(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.PRICE_RANGE_DROPDOWN_ELEMENT));
        return element;
    }

    // Press the 100-199 range
    public static WebElement priceRangePicker(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.PRICE_RANGE_CHOICE));
        return element;
    }

    // Press the area dropdown menu
    public static WebElement areaDropDownMenu(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.AREA_DROPDOWN_ELEMENT));
        return element;
    }

    // Press the north area
    public static WebElement areaPicker(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.AREA_CHOICE));
        return element;
    }

    // Press the area dropdown menu
    public static WebElement categoryDropDownMenu(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.CATEGORY_DROPDOWN_ELEMENT));
        return element;
    }

    // Press the north area
    public static WebElement categoryPicker(WebDriver driver) {
        element = driver.findElement(By.xpath(Constants.CATEGORY_CHOICE));
        return element;
    }

    // Press the search button
    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector(Constants.SEARCH_BUTTON));
        return element;
    }
}
