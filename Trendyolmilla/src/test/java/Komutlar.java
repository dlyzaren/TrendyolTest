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

   public void bulanaKadarIn(String elementsId) {

       WebElement kaydir =  driver.findElement(By.xpath(elementsId));

        //Actions actions = new Actions(driver); //ALTERNATİF
        //actions.moveToElement(kaydır);
       // actions.perform();

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("arguments[0].scrollIntoView();",kaydir);


    }
   public void sepeteEklendiTespit(String elementId) {
       String tespit = driver.findElement(By.cssSelector(".add-to-basket-button-text-success")).getText();
       System.out.println("Sayfa mesajınız; " + tespit);


   }
   public void yeniSekmeyeGec(){
       Set<String> windows; // sekmeleri tutacak
       Iterator<String> window; // sekmeler arasında gezmemeizi sağlayacak arama yapmamızı

       String parentId; //iterator için ana sekme
       String chilIdOne;
       windows = driver.getWindowHandles();

       window = windows.iterator();
       parentId = window.next();
       chilIdOne = window.next();
       driver.switchTo().window(chilIdOne);

   }

 public void sepetimeGelXpath(String elementId) {
       WebElement sepet = driver.findElement(By.xpath(elementId));

       Actions actions = new Actions(driver);
       actions.moveToElement(sepet).perform();


   }
    public void sepetimeGelCss(String elementId) {
        WebElement sepetCss = driver.findElement(By.cssSelector(elementId));

        Actions actions = new Actions(driver);
        actions.moveToElement(sepetCss).click().perform();


    }
    public void sepetBilgileriGelsin(String bilgi){
       String bilgiler=  driver.findElement(By.cssSelector(bilgi)).getText();
        System.out.println("Sepet bilgileriniz : " +bilgiler);
    }

    public void testSondAdim(String gelen){
        String beklenenMesaj = "Trendyol Hesabınız Yok Mu?";
        String gelenMesaj = driver.findElement(By.cssSelector(gelen)).getText();
        Assertions.assertEquals(beklenenMesaj,gelenMesaj);
        System.out.println("Beklenen mesaj; " +beklenenMesaj + " Gelen mesaj ; " +gelenMesaj);




    }



    
}

