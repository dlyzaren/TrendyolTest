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
        
       //anaSayfa.bulanaKadarIn(anaSayfa.pembe); ACTION ALTERNATİF

        anaSayfa.bulanaKadarIn(anaSayfa.pembe);

        anaSayfa.tusaBasXpath(anaSayfa.pembe);
        Thread.sleep(milis);


        anaSayfa.yeniSekmeyeGec(); //seçilen ürünü yeni sekmede açtığı için sekme değiştirmen gerekir


        anaSayfa.tusaBasXpath(anaSayfa.bedenSec);
        Thread.sleep(milis);

        anaSayfa.tusaBasCSS(anaSayfa.sepeteAt);
        Thread.sleep(milis);
        anaSayfa.sepeteEklendiTespit(anaSayfa.sepeteEklendi);
        Thread.sleep(milis);
        anaSayfa.sepetimeGelXpath(anaSayfa.sepetim);  //sepetim butonunun üzerine geldi
        Thread.sleep(1000);
        anaSayfa.sepetimeGelCss(anaSayfa.siparisiTamamla); //sepetim butonunun üzerine geldiğinde siparişi tamamlaya tıkladı
        Thread.sleep(milis);

        anaSayfa.tusaBasCSS(anaSayfa.sepetteCarpi);
        Thread.sleep(milis);

        anaSayfa.sepetBilgileriGelsin(anaSayfa.sepetBilgeri);

        anaSayfa.tusaBasXpath(anaSayfa.sepetiOnayla);
        Thread.sleep(milis);

        anaSayfa.testSondAdim(anaSayfa.gelenMesajim);
        Thread.sleep(milis);

        
    }
    
      @AfterEach
    public void tearDown() {
        driver.quit();
    }


}
