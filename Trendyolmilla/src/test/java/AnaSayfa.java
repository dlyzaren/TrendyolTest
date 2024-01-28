import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnaSayfa extends Komutlar{

 public final String arama = "[placeholder='Aradığınız ürün, kategori veya markayı yazınız']";
 public final String enter = ".cyrzo7gC";

 public final String carpi = "Combined-Shape";

 public final String arananUrun= "Antrasit Selanik/Triko Görünümlü Fermuarlı Yaka Regular";


 public final String pembe = "//span[contains(.,'Fuşya Kalın İçi Polarlı Regular/Normal Kalıp Bisiklet Yaka Basic Örme Sweatshirt')]";

 public final String millaSec = "//div[@class='aggrgtn-cntnr-wrppr']/div[@class='fltrs-wrppr hide-fltrs']/div[2]//div[2]//div[@class='chckbox']";


//span[contains(.,'Antrasit Selanik/Triko Görünümlü Fermuarlı Yaka Regular/Normal Kalıp Örme Sweats')]






    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
