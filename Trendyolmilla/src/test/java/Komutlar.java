import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Komutlar {

    WebDriver driver;
    JavascriptExecutor jsx = (JavascriptExecutor) driver;

    public Komutlar(WebDriver driver) {

        this.driver = driver;

    }

    public void elementGozukeneKadarCSS(String elementId) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(elementId)));


    }

    public void tusaBasCSS(String tusaId) {
        driver.findElement(By.cssSelector(tusaId)).click();

    }

    public void tusaBasId(String tusId) {

        driver.findElement(By.id(tusId)).click();
    }

    public void tusaBasXpath(String tusId) {

        driver.findElement(By.xpath(tusId)).click();
    }


    public void yaziyaz(String elementId, String yazi) {
        driver.findElement(By.cssSelector(elementId)).sendKeys(yazi);


    }

    public void bulanaKadarIn(String elementId) {
        driver.findElement(By.partialLinkText(elementId));

    }
}

