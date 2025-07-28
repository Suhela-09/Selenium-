package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtons {

	@Test
	public void TestRadioButton() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	    Thread.sleep(5000);
	    
	    int radiobutton = driver.findElements(By.xpath("(//input[@id='sex'])[3]")).size();
	    System.out.println("Number Of Radio Buttons...." + radiobutton);
	    driver.quit();
	}
}
