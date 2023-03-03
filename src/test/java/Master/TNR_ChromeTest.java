package test.java.Master;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TNR_ChromeTest {

    @Test
    public void startChromeDriver(){
        //Ajout du chemin driver
        String s = System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //Initialisation de l'instance du driver
        WebDriver driver = new ChromeDriver();

        //Démarrage du navigateur
        driver.get("https://www.google.fr");

        //Fermeture du navigateur
        driver.quit();
    }

}