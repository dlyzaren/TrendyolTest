import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnaSayfa extends Komutlar{

 public final String arama = "[placeholder='Aradığınız ürün, kategori veya markayı yazınız']";
 public final String enter = ".cyrzo7gC";

 public final String carpi = "Combined-Shape";

 public final String arananUrun= "Antrasit Selanik/Triko Görünümlü Fermuarlı Yaka Regular";


 public final String pembe = "//span[contains(.,'Kırmızı Kalın İçi Polarlı Dik Yaka Relaxed/Rahat Kalıp Örme Sweatshirt TWOAW20SW')]";

 public final String millaSec = "//div[@class='aggrgtn-cntnr-wrppr']/div[@class='fltrs-wrppr hide-fltrs']/div[2]//div[2]//div[@class='chckbox']";
 
 public final String  pembe = "//span[contains(.,'Kırmızı Kalın İçi Polarlı Dik Yaka Relaxed/Rahat Kalıp Örme Sweatshirt TWOAW20SW')]";

 public final String bedenSec = "//div[.='XL']";

 public final String sepeteAt = ".add-to-basket-button-text";

 public final String sepeteEklendi = ".add-to-basket-button-text-success";

  public final String sepetim = "//p[.='Sepetim']";

 public final String siparisiTamamla = ".CompleteOrder";

 public final String sepetBilgeri = ".pb-summary-box";

 public final String sepetiOnayla = "//div[@class='pb-summary']/div[4]/a[.='Sepeti Onayla']";

 public final String gelenMesajim= ".pb-guest-order-flow-modal-content";







    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
