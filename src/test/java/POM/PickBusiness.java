package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class PickBusiness {


    private static WebElement element = null;

    // Press the north area
    public static WebElement buisnessPicker(WebDriver driver) {
        element = driver.findElement(By.cssSelector(Constants.BUISNESS));
        return element;
    }
}
