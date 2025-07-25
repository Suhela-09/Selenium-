package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateForward {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.get(" https://demo.opencart.com/");
        driver.get("http://www.bing.com");
        driver.navigate().back();     // Goes back to google.com
        driver.navigate().forward();  // Goes forward to wikipedia.org

        String URL = driver.getCurrentUrl();
        System.out.println(URL);
       
    }
}
