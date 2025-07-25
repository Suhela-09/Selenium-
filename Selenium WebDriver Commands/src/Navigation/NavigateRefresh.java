package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRefresh {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(" https://demo.opencart.com/");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.navigate().refresh();  // Reloads Wikipedia

        String URL = driver.getCurrentUrl();
        System.out.println(URL);
       
    }
}
