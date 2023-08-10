package StepDefinition;

import Locatori.Locatori;
import Utilities.ChromeConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.awt.datatransfer.StringSelection;

public class StepDefinition {
    ChromeDriver driver;
    Locatori locatori = new Locatori();

    @Given("Open the browser")
    public void deschideChrome() {
        driver = ChromeConfig.getChromeDriver();
    }

    @When("Access page {string}")
    public void acceseazaPagina(String url) {
        driver.get(url);
    }

    @And("Press button {string}")
    public void apasaButon(String var) {
        By buttonlocator = locatori.numeButon(var);
        WebElement element = driver.findElement(buttonlocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    @And("Complete field {string} with value {string}")
    public void completeazaField(String numecamp, String value) {
        By fieldlocator = locatori.numeField(numecamp);
        WebElement element = driver.findElement(fieldlocator);
        element.sendKeys(value);

    }


    @And("Close Browser")
    public void inchideBrowser() {
        driver.quit();
    }


}



