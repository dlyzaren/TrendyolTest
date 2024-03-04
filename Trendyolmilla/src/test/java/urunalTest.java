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
        anaSayfa.linkKontrol("https://www.trendyol-milla.com/sr?wc=1179&wb=101476&qt=sweatshirt&st=sweatshirt&os=1");
        
       //anaSayfa.bulanaKadarIn(anaSayfa.pembe); ACTION ALTERNATİF

        anaSayfa.bulanaKadarIn(anaSayfa.pembe);

        anaSayfa.tusaBasXpath(anaSayfa.pembe);
        Thread.sleep(milis);


        anaSayfa.yeniSekmeyeGec(); //seçilen ürünü yeni sekmede açtığı için sekme değiştirmen gerekir
         anaSayfa.urunIsimKontrol("Kırmızı Kalın İçi Polarlı Dik Yaka Relaxed/Rahat Kalıp Örme Sweatshirt TWOAW20SW0584", anaSayfa.gelenUrün);


        anaSayfa.tusaBasXpath(anaSayfa.bedenSec);
        Thread.sleep(milis);

        anaSayfa.tusaBasCSS(anaSayfa.sepeteAt);
        anaSayfa.sepeteEklendiTespit(anaSayfa.sepeteEklendi);
        anaSayfa.sepetimeGelXpath(anaSayfa.sepetim);  //sepetim butonunun üzerine geldi
        Thread.sleep(1000);
        anaSayfa.sepetimeGelCss(anaSayfa.siparisiTamamla); //sepetim butonunun üzerine geldiğinde siparişi tamamlaya tıkladı

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
