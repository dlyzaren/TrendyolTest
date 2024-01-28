import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urunalTest  {


    private WebDriver driver ;
    private Komutlar  komutlar;
    private AnaSayfa anaSayfa;
    JavascriptExecutor jsx = (JavascriptExecutor) driver;
    static int milis= 1500;






    @BeforeEach
    void setup(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        driver.get("https://www.trendyol-milla.com/");
       


    }

    @Test
    void trendyolTesti() throws InterruptedException {

        anaSayfa.tusaBasId(anaSayfa.carpi);
        anaSayfa.elementGozukeneKadarCSS(anaSayfa.arama);
        anaSayfa.tusaBasCSS(anaSayfa.arama);

        anaSayfa.yaziyaz(anaSayfa.arama, "sweatshirt");
        anaSayfa.tusaBasCSS(anaSayfa.enter);
        Thread.sleep(milis);

        anaSayfa.tusaBasXpath(anaSayfa.millaSec);
        Thread.sleep(milis); 
        
        anaSayfa.bulanaKadarIn(anaSayfa.pembe); //inmiyor



        


    }



}
