package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateback {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hollandandbarrett.com/");
        driver.manage().window().maximize();
        String URL = driver.getCurrentUrl();
        System.out.println(URL); // ✅ Capitalized "System"
        
        driver.navigate().to(URL);
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        driver.quit();
    
    }
}
