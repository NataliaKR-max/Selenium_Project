import POM.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class BrowserAndURL {

    /* Method for reading data from the xml file */
    static String getData(String keyName) throws ParserConfigurationException, IOException, SAXException {

        File configXmlFile = new File(Constants.BROWSER_AND_URL_FILE);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(configXmlFile);

        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }

    /* Method for configuring the driver object according to the chosen browser type */
    static WebDriver chooseBrowser(String browser, WebDriver driver) {

        if (browser.equals(Constants.CHROME)) {
            System.setProperty(Constants.CHROME_DRIVER_SERVER_NAME, Constants.CHROME_DRIVER_FILE_PATH);
            driver = new ChromeDriver();
        } else if (browser.equals(Constants.FIREFOX)) {
            System.setProperty(Constants.FIREFOX_DRIVER_SERVER_NAME, Constants.FIREFOX_DRIVER_FILE_PATH);
            driver = new FirefoxDriver();
        } else if (browser.equals(Constants.EDGE)) {
            System.setProperty(Constants.EDGE_DRIVER_SERVER_NAME, Constants.EDGE_DRIVER_FILE_PATH);
            driver = new EdgeDriver();
        } else if (browser.equals(Constants.IE)) {
            System.setProperty(Constants.IE_DRIVER_SERVER_NAME, Constants.IE_DRIVER_FILE_PATH);
            driver = new InternetExplorerDriver();
        } else {

        }
        return driver;
    }
}
